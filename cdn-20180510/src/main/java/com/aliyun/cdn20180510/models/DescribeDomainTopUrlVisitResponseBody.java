// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainTopUrlVisitResponseBody extends TeaModel {
    // A list of frequently requested URLs.
    @NameInMap("AllUrlList")
    public DescribeDomainTopUrlVisitResponseBodyAllUrlList allUrlList;

    // The accelerated domain name.
    @NameInMap("DomainName")
    public String domainName;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The start of the time range that was queried.
    @NameInMap("StartTime")
    public String startTime;

    // A list of URLs for which 2xx status codes were returned.
    @NameInMap("Url200List")
    public DescribeDomainTopUrlVisitResponseBodyUrl200List url200List;

    // A list of URLs for which 3xx status codes were returned.
    @NameInMap("Url300List")
    public DescribeDomainTopUrlVisitResponseBodyUrl300List url300List;

    // A list of URLs for which 4xx status codes were returned.
    @NameInMap("Url400List")
    public DescribeDomainTopUrlVisitResponseBodyUrl400List url400List;

    // A list of URLs for which 5xx status codes were returned.
    @NameInMap("Url500List")
    public DescribeDomainTopUrlVisitResponseBodyUrl500List url500List;

    public static DescribeDomainTopUrlVisitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainTopUrlVisitResponseBody self = new DescribeDomainTopUrlVisitResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainTopUrlVisitResponseBody setAllUrlList(DescribeDomainTopUrlVisitResponseBodyAllUrlList allUrlList) {
        this.allUrlList = allUrlList;
        return this;
    }
    public DescribeDomainTopUrlVisitResponseBodyAllUrlList getAllUrlList() {
        return this.allUrlList;
    }

    public DescribeDomainTopUrlVisitResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainTopUrlVisitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainTopUrlVisitResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDomainTopUrlVisitResponseBody setUrl200List(DescribeDomainTopUrlVisitResponseBodyUrl200List url200List) {
        this.url200List = url200List;
        return this;
    }
    public DescribeDomainTopUrlVisitResponseBodyUrl200List getUrl200List() {
        return this.url200List;
    }

    public DescribeDomainTopUrlVisitResponseBody setUrl300List(DescribeDomainTopUrlVisitResponseBodyUrl300List url300List) {
        this.url300List = url300List;
        return this;
    }
    public DescribeDomainTopUrlVisitResponseBodyUrl300List getUrl300List() {
        return this.url300List;
    }

    public DescribeDomainTopUrlVisitResponseBody setUrl400List(DescribeDomainTopUrlVisitResponseBodyUrl400List url400List) {
        this.url400List = url400List;
        return this;
    }
    public DescribeDomainTopUrlVisitResponseBodyUrl400List getUrl400List() {
        return this.url400List;
    }

    public DescribeDomainTopUrlVisitResponseBody setUrl500List(DescribeDomainTopUrlVisitResponseBodyUrl500List url500List) {
        this.url500List = url500List;
        return this;
    }
    public DescribeDomainTopUrlVisitResponseBodyUrl500List getUrl500List() {
        return this.url500List;
    }

    public static class DescribeDomainTopUrlVisitResponseBodyAllUrlListUrlList extends TeaModel {
        // The amount of network traffic. (Unit: bytes)
        @NameInMap("Flow")
        public String flow;

        // The proportion of the amount of network traffic consumed for visiting the web page.
        @NameInMap("FlowProportion")
        public Float flowProportion;

        // The complete URL.
        @NameInMap("UrlDetail")
        public String urlDetail;

        // The number of visits to the specified path.
        @NameInMap("VisitData")
        public String visitData;

        // The proportion of visits to the web page.
        @NameInMap("VisitProportion")
        public Float visitProportion;

        public static DescribeDomainTopUrlVisitResponseBodyAllUrlListUrlList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainTopUrlVisitResponseBodyAllUrlListUrlList self = new DescribeDomainTopUrlVisitResponseBodyAllUrlListUrlList();
            return TeaModel.build(map, self);
        }

        public DescribeDomainTopUrlVisitResponseBodyAllUrlListUrlList setFlow(String flow) {
            this.flow = flow;
            return this;
        }
        public String getFlow() {
            return this.flow;
        }

        public DescribeDomainTopUrlVisitResponseBodyAllUrlListUrlList setFlowProportion(Float flowProportion) {
            this.flowProportion = flowProportion;
            return this;
        }
        public Float getFlowProportion() {
            return this.flowProportion;
        }

        public DescribeDomainTopUrlVisitResponseBodyAllUrlListUrlList setUrlDetail(String urlDetail) {
            this.urlDetail = urlDetail;
            return this;
        }
        public String getUrlDetail() {
            return this.urlDetail;
        }

        public DescribeDomainTopUrlVisitResponseBodyAllUrlListUrlList setVisitData(String visitData) {
            this.visitData = visitData;
            return this;
        }
        public String getVisitData() {
            return this.visitData;
        }

        public DescribeDomainTopUrlVisitResponseBodyAllUrlListUrlList setVisitProportion(Float visitProportion) {
            this.visitProportion = visitProportion;
            return this;
        }
        public Float getVisitProportion() {
            return this.visitProportion;
        }

    }

    public static class DescribeDomainTopUrlVisitResponseBodyAllUrlList extends TeaModel {
        @NameInMap("UrlList")
        public java.util.List<DescribeDomainTopUrlVisitResponseBodyAllUrlListUrlList> urlList;

        public static DescribeDomainTopUrlVisitResponseBodyAllUrlList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainTopUrlVisitResponseBodyAllUrlList self = new DescribeDomainTopUrlVisitResponseBodyAllUrlList();
            return TeaModel.build(map, self);
        }

        public DescribeDomainTopUrlVisitResponseBodyAllUrlList setUrlList(java.util.List<DescribeDomainTopUrlVisitResponseBodyAllUrlListUrlList> urlList) {
            this.urlList = urlList;
            return this;
        }
        public java.util.List<DescribeDomainTopUrlVisitResponseBodyAllUrlListUrlList> getUrlList() {
            return this.urlList;
        }

    }

    public static class DescribeDomainTopUrlVisitResponseBodyUrl200ListUrlList extends TeaModel {
        // The amount of network traffic. (Unit: bytes)
        @NameInMap("Flow")
        public String flow;

        // The proportion of the amount of network traffic consumed for visiting the web page.
        @NameInMap("FlowProportion")
        public Float flowProportion;

        // The complete URL.
        @NameInMap("UrlDetail")
        public String urlDetail;

        // The number of visits to the specified path.
        @NameInMap("VisitData")
        public String visitData;

        // The proportion of visits to the web page.
        @NameInMap("VisitProportion")
        public Float visitProportion;

        public static DescribeDomainTopUrlVisitResponseBodyUrl200ListUrlList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainTopUrlVisitResponseBodyUrl200ListUrlList self = new DescribeDomainTopUrlVisitResponseBodyUrl200ListUrlList();
            return TeaModel.build(map, self);
        }

        public DescribeDomainTopUrlVisitResponseBodyUrl200ListUrlList setFlow(String flow) {
            this.flow = flow;
            return this;
        }
        public String getFlow() {
            return this.flow;
        }

        public DescribeDomainTopUrlVisitResponseBodyUrl200ListUrlList setFlowProportion(Float flowProportion) {
            this.flowProportion = flowProportion;
            return this;
        }
        public Float getFlowProportion() {
            return this.flowProportion;
        }

        public DescribeDomainTopUrlVisitResponseBodyUrl200ListUrlList setUrlDetail(String urlDetail) {
            this.urlDetail = urlDetail;
            return this;
        }
        public String getUrlDetail() {
            return this.urlDetail;
        }

        public DescribeDomainTopUrlVisitResponseBodyUrl200ListUrlList setVisitData(String visitData) {
            this.visitData = visitData;
            return this;
        }
        public String getVisitData() {
            return this.visitData;
        }

        public DescribeDomainTopUrlVisitResponseBodyUrl200ListUrlList setVisitProportion(Float visitProportion) {
            this.visitProportion = visitProportion;
            return this;
        }
        public Float getVisitProportion() {
            return this.visitProportion;
        }

    }

    public static class DescribeDomainTopUrlVisitResponseBodyUrl200List extends TeaModel {
        @NameInMap("UrlList")
        public java.util.List<DescribeDomainTopUrlVisitResponseBodyUrl200ListUrlList> urlList;

        public static DescribeDomainTopUrlVisitResponseBodyUrl200List build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainTopUrlVisitResponseBodyUrl200List self = new DescribeDomainTopUrlVisitResponseBodyUrl200List();
            return TeaModel.build(map, self);
        }

        public DescribeDomainTopUrlVisitResponseBodyUrl200List setUrlList(java.util.List<DescribeDomainTopUrlVisitResponseBodyUrl200ListUrlList> urlList) {
            this.urlList = urlList;
            return this;
        }
        public java.util.List<DescribeDomainTopUrlVisitResponseBodyUrl200ListUrlList> getUrlList() {
            return this.urlList;
        }

    }

    public static class DescribeDomainTopUrlVisitResponseBodyUrl300ListUrlList extends TeaModel {
        // The amount of network traffic. (Unit: bytes)
        @NameInMap("Flow")
        public String flow;

        // The proportion of the amount of network traffic consumed for visiting the web page.
        @NameInMap("FlowProportion")
        public Float flowProportion;

        // The complete URL.
        @NameInMap("UrlDetail")
        public String urlDetail;

        // The number of visits to the URL.
        @NameInMap("VisitData")
        public String visitData;

        // The proportion of visits to the web page.
        @NameInMap("VisitProportion")
        public Float visitProportion;

        public static DescribeDomainTopUrlVisitResponseBodyUrl300ListUrlList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainTopUrlVisitResponseBodyUrl300ListUrlList self = new DescribeDomainTopUrlVisitResponseBodyUrl300ListUrlList();
            return TeaModel.build(map, self);
        }

        public DescribeDomainTopUrlVisitResponseBodyUrl300ListUrlList setFlow(String flow) {
            this.flow = flow;
            return this;
        }
        public String getFlow() {
            return this.flow;
        }

        public DescribeDomainTopUrlVisitResponseBodyUrl300ListUrlList setFlowProportion(Float flowProportion) {
            this.flowProportion = flowProportion;
            return this;
        }
        public Float getFlowProportion() {
            return this.flowProportion;
        }

        public DescribeDomainTopUrlVisitResponseBodyUrl300ListUrlList setUrlDetail(String urlDetail) {
            this.urlDetail = urlDetail;
            return this;
        }
        public String getUrlDetail() {
            return this.urlDetail;
        }

        public DescribeDomainTopUrlVisitResponseBodyUrl300ListUrlList setVisitData(String visitData) {
            this.visitData = visitData;
            return this;
        }
        public String getVisitData() {
            return this.visitData;
        }

        public DescribeDomainTopUrlVisitResponseBodyUrl300ListUrlList setVisitProportion(Float visitProportion) {
            this.visitProportion = visitProportion;
            return this;
        }
        public Float getVisitProportion() {
            return this.visitProportion;
        }

    }

    public static class DescribeDomainTopUrlVisitResponseBodyUrl300List extends TeaModel {
        @NameInMap("UrlList")
        public java.util.List<DescribeDomainTopUrlVisitResponseBodyUrl300ListUrlList> urlList;

        public static DescribeDomainTopUrlVisitResponseBodyUrl300List build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainTopUrlVisitResponseBodyUrl300List self = new DescribeDomainTopUrlVisitResponseBodyUrl300List();
            return TeaModel.build(map, self);
        }

        public DescribeDomainTopUrlVisitResponseBodyUrl300List setUrlList(java.util.List<DescribeDomainTopUrlVisitResponseBodyUrl300ListUrlList> urlList) {
            this.urlList = urlList;
            return this;
        }
        public java.util.List<DescribeDomainTopUrlVisitResponseBodyUrl300ListUrlList> getUrlList() {
            return this.urlList;
        }

    }

    public static class DescribeDomainTopUrlVisitResponseBodyUrl400ListUrlList extends TeaModel {
        // The amount of network traffic. (Unit: bytes)
        @NameInMap("Flow")
        public String flow;

        // The proportion of the amount of network traffic consumed for visiting the web page.
        @NameInMap("FlowProportion")
        public Float flowProportion;

        // The complete URL.
        @NameInMap("UrlDetail")
        public String urlDetail;

        // The number of visits to the URL.
        @NameInMap("VisitData")
        public String visitData;

        // The proportion of visits to the web page.
        @NameInMap("VisitProportion")
        public Float visitProportion;

        public static DescribeDomainTopUrlVisitResponseBodyUrl400ListUrlList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainTopUrlVisitResponseBodyUrl400ListUrlList self = new DescribeDomainTopUrlVisitResponseBodyUrl400ListUrlList();
            return TeaModel.build(map, self);
        }

        public DescribeDomainTopUrlVisitResponseBodyUrl400ListUrlList setFlow(String flow) {
            this.flow = flow;
            return this;
        }
        public String getFlow() {
            return this.flow;
        }

        public DescribeDomainTopUrlVisitResponseBodyUrl400ListUrlList setFlowProportion(Float flowProportion) {
            this.flowProportion = flowProportion;
            return this;
        }
        public Float getFlowProportion() {
            return this.flowProportion;
        }

        public DescribeDomainTopUrlVisitResponseBodyUrl400ListUrlList setUrlDetail(String urlDetail) {
            this.urlDetail = urlDetail;
            return this;
        }
        public String getUrlDetail() {
            return this.urlDetail;
        }

        public DescribeDomainTopUrlVisitResponseBodyUrl400ListUrlList setVisitData(String visitData) {
            this.visitData = visitData;
            return this;
        }
        public String getVisitData() {
            return this.visitData;
        }

        public DescribeDomainTopUrlVisitResponseBodyUrl400ListUrlList setVisitProportion(Float visitProportion) {
            this.visitProportion = visitProportion;
            return this;
        }
        public Float getVisitProportion() {
            return this.visitProportion;
        }

    }

    public static class DescribeDomainTopUrlVisitResponseBodyUrl400List extends TeaModel {
        @NameInMap("UrlList")
        public java.util.List<DescribeDomainTopUrlVisitResponseBodyUrl400ListUrlList> urlList;

        public static DescribeDomainTopUrlVisitResponseBodyUrl400List build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainTopUrlVisitResponseBodyUrl400List self = new DescribeDomainTopUrlVisitResponseBodyUrl400List();
            return TeaModel.build(map, self);
        }

        public DescribeDomainTopUrlVisitResponseBodyUrl400List setUrlList(java.util.List<DescribeDomainTopUrlVisitResponseBodyUrl400ListUrlList> urlList) {
            this.urlList = urlList;
            return this;
        }
        public java.util.List<DescribeDomainTopUrlVisitResponseBodyUrl400ListUrlList> getUrlList() {
            return this.urlList;
        }

    }

    public static class DescribeDomainTopUrlVisitResponseBodyUrl500ListUrlList extends TeaModel {
        // The amount of network traffic. (Unit: bytes)
        @NameInMap("Flow")
        public String flow;

        // The proportion of the amount of network traffic consumed for visiting the web page.
        @NameInMap("FlowProportion")
        public Float flowProportion;

        // The complete URL.
        @NameInMap("UrlDetail")
        public String urlDetail;

        // The number of visits to the URL.
        @NameInMap("VisitData")
        public String visitData;

        // The proportion of visits to the web page.
        @NameInMap("VisitProportion")
        public Float visitProportion;

        public static DescribeDomainTopUrlVisitResponseBodyUrl500ListUrlList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainTopUrlVisitResponseBodyUrl500ListUrlList self = new DescribeDomainTopUrlVisitResponseBodyUrl500ListUrlList();
            return TeaModel.build(map, self);
        }

        public DescribeDomainTopUrlVisitResponseBodyUrl500ListUrlList setFlow(String flow) {
            this.flow = flow;
            return this;
        }
        public String getFlow() {
            return this.flow;
        }

        public DescribeDomainTopUrlVisitResponseBodyUrl500ListUrlList setFlowProportion(Float flowProportion) {
            this.flowProportion = flowProportion;
            return this;
        }
        public Float getFlowProportion() {
            return this.flowProportion;
        }

        public DescribeDomainTopUrlVisitResponseBodyUrl500ListUrlList setUrlDetail(String urlDetail) {
            this.urlDetail = urlDetail;
            return this;
        }
        public String getUrlDetail() {
            return this.urlDetail;
        }

        public DescribeDomainTopUrlVisitResponseBodyUrl500ListUrlList setVisitData(String visitData) {
            this.visitData = visitData;
            return this;
        }
        public String getVisitData() {
            return this.visitData;
        }

        public DescribeDomainTopUrlVisitResponseBodyUrl500ListUrlList setVisitProportion(Float visitProportion) {
            this.visitProportion = visitProportion;
            return this;
        }
        public Float getVisitProportion() {
            return this.visitProportion;
        }

    }

    public static class DescribeDomainTopUrlVisitResponseBodyUrl500List extends TeaModel {
        @NameInMap("UrlList")
        public java.util.List<DescribeDomainTopUrlVisitResponseBodyUrl500ListUrlList> urlList;

        public static DescribeDomainTopUrlVisitResponseBodyUrl500List build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainTopUrlVisitResponseBodyUrl500List self = new DescribeDomainTopUrlVisitResponseBodyUrl500List();
            return TeaModel.build(map, self);
        }

        public DescribeDomainTopUrlVisitResponseBodyUrl500List setUrlList(java.util.List<DescribeDomainTopUrlVisitResponseBodyUrl500ListUrlList> urlList) {
            this.urlList = urlList;
            return this;
        }
        public java.util.List<DescribeDomainTopUrlVisitResponseBodyUrl500ListUrlList> getUrlList() {
            return this.urlList;
        }

    }

}
