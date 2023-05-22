// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainTopUrlVisitResponseBody extends TeaModel {
    /**
     * <p>A list of frequently requested URLs.</p>
     */
    @NameInMap("AllUrlList")
    public DescribeDcdnDomainTopUrlVisitResponseBodyAllUrlList allUrlList;

    /**
     * <p>The accelerated domain name.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The start of the time range during which data was queried.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>A list of URLs for which 2xx status codes were returned.</p>
     */
    @NameInMap("Url200List")
    public DescribeDcdnDomainTopUrlVisitResponseBodyUrl200List url200List;

    /**
     * <p>A list of URLs for which 3xx status codes were returned.</p>
     */
    @NameInMap("Url300List")
    public DescribeDcdnDomainTopUrlVisitResponseBodyUrl300List url300List;

    /**
     * <p>A list of URLs for which 4xx status codes were returned.</p>
     */
    @NameInMap("Url400List")
    public DescribeDcdnDomainTopUrlVisitResponseBodyUrl400List url400List;

    /**
     * <p>A list of URLs for which 5xx status codes were returned.</p>
     */
    @NameInMap("Url500List")
    public DescribeDcdnDomainTopUrlVisitResponseBodyUrl500List url500List;

    public static DescribeDcdnDomainTopUrlVisitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainTopUrlVisitResponseBody self = new DescribeDcdnDomainTopUrlVisitResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainTopUrlVisitResponseBody setAllUrlList(DescribeDcdnDomainTopUrlVisitResponseBodyAllUrlList allUrlList) {
        this.allUrlList = allUrlList;
        return this;
    }
    public DescribeDcdnDomainTopUrlVisitResponseBodyAllUrlList getAllUrlList() {
        return this.allUrlList;
    }

    public DescribeDcdnDomainTopUrlVisitResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDcdnDomainTopUrlVisitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnDomainTopUrlVisitResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDcdnDomainTopUrlVisitResponseBody setUrl200List(DescribeDcdnDomainTopUrlVisitResponseBodyUrl200List url200List) {
        this.url200List = url200List;
        return this;
    }
    public DescribeDcdnDomainTopUrlVisitResponseBodyUrl200List getUrl200List() {
        return this.url200List;
    }

    public DescribeDcdnDomainTopUrlVisitResponseBody setUrl300List(DescribeDcdnDomainTopUrlVisitResponseBodyUrl300List url300List) {
        this.url300List = url300List;
        return this;
    }
    public DescribeDcdnDomainTopUrlVisitResponseBodyUrl300List getUrl300List() {
        return this.url300List;
    }

    public DescribeDcdnDomainTopUrlVisitResponseBody setUrl400List(DescribeDcdnDomainTopUrlVisitResponseBodyUrl400List url400List) {
        this.url400List = url400List;
        return this;
    }
    public DescribeDcdnDomainTopUrlVisitResponseBodyUrl400List getUrl400List() {
        return this.url400List;
    }

    public DescribeDcdnDomainTopUrlVisitResponseBody setUrl500List(DescribeDcdnDomainTopUrlVisitResponseBodyUrl500List url500List) {
        this.url500List = url500List;
        return this;
    }
    public DescribeDcdnDomainTopUrlVisitResponseBodyUrl500List getUrl500List() {
        return this.url500List;
    }

    public static class DescribeDcdnDomainTopUrlVisitResponseBodyAllUrlListUrlList extends TeaModel {
        /**
         * <p>The amount of network traffic. Unit: bytes.</p>
         */
        @NameInMap("Flow")
        public String flow;

        /**
         * <p>The proportion of network traffic consumed to access the URL.</p>
         */
        @NameInMap("FlowProportion")
        public Float flowProportion;

        /**
         * <p>The complete URL.</p>
         */
        @NameInMap("UrlDetail")
        public String urlDetail;

        /**
         * <p>The number of visits to the URL.</p>
         */
        @NameInMap("VisitData")
        public String visitData;

        /**
         * <p>The proportion of visits to the URL.</p>
         */
        @NameInMap("VisitProportion")
        public Float visitProportion;

        public static DescribeDcdnDomainTopUrlVisitResponseBodyAllUrlListUrlList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainTopUrlVisitResponseBodyAllUrlListUrlList self = new DescribeDcdnDomainTopUrlVisitResponseBodyAllUrlListUrlList();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainTopUrlVisitResponseBodyAllUrlListUrlList setFlow(String flow) {
            this.flow = flow;
            return this;
        }
        public String getFlow() {
            return this.flow;
        }

        public DescribeDcdnDomainTopUrlVisitResponseBodyAllUrlListUrlList setFlowProportion(Float flowProportion) {
            this.flowProportion = flowProportion;
            return this;
        }
        public Float getFlowProportion() {
            return this.flowProportion;
        }

        public DescribeDcdnDomainTopUrlVisitResponseBodyAllUrlListUrlList setUrlDetail(String urlDetail) {
            this.urlDetail = urlDetail;
            return this;
        }
        public String getUrlDetail() {
            return this.urlDetail;
        }

        public DescribeDcdnDomainTopUrlVisitResponseBodyAllUrlListUrlList setVisitData(String visitData) {
            this.visitData = visitData;
            return this;
        }
        public String getVisitData() {
            return this.visitData;
        }

        public DescribeDcdnDomainTopUrlVisitResponseBodyAllUrlListUrlList setVisitProportion(Float visitProportion) {
            this.visitProportion = visitProportion;
            return this;
        }
        public Float getVisitProportion() {
            return this.visitProportion;
        }

    }

    public static class DescribeDcdnDomainTopUrlVisitResponseBodyAllUrlList extends TeaModel {
        @NameInMap("UrlList")
        public java.util.List<DescribeDcdnDomainTopUrlVisitResponseBodyAllUrlListUrlList> urlList;

        public static DescribeDcdnDomainTopUrlVisitResponseBodyAllUrlList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainTopUrlVisitResponseBodyAllUrlList self = new DescribeDcdnDomainTopUrlVisitResponseBodyAllUrlList();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainTopUrlVisitResponseBodyAllUrlList setUrlList(java.util.List<DescribeDcdnDomainTopUrlVisitResponseBodyAllUrlListUrlList> urlList) {
            this.urlList = urlList;
            return this;
        }
        public java.util.List<DescribeDcdnDomainTopUrlVisitResponseBodyAllUrlListUrlList> getUrlList() {
            return this.urlList;
        }

    }

    public static class DescribeDcdnDomainTopUrlVisitResponseBodyUrl200ListUrlList extends TeaModel {
        /**
         * <p>The amount of network traffic. Unit: bytes.</p>
         */
        @NameInMap("Flow")
        public String flow;

        /**
         * <p>The proportion of network traffic consumed to access the URL.</p>
         */
        @NameInMap("FlowProportion")
        public Float flowProportion;

        /**
         * <p>The complete URL.</p>
         */
        @NameInMap("UrlDetail")
        public String urlDetail;

        /**
         * <p>The number of visits to the URL.</p>
         */
        @NameInMap("VisitData")
        public String visitData;

        /**
         * <p>The proportion of visits to the URL.</p>
         */
        @NameInMap("VisitProportion")
        public Float visitProportion;

        public static DescribeDcdnDomainTopUrlVisitResponseBodyUrl200ListUrlList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainTopUrlVisitResponseBodyUrl200ListUrlList self = new DescribeDcdnDomainTopUrlVisitResponseBodyUrl200ListUrlList();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainTopUrlVisitResponseBodyUrl200ListUrlList setFlow(String flow) {
            this.flow = flow;
            return this;
        }
        public String getFlow() {
            return this.flow;
        }

        public DescribeDcdnDomainTopUrlVisitResponseBodyUrl200ListUrlList setFlowProportion(Float flowProportion) {
            this.flowProportion = flowProportion;
            return this;
        }
        public Float getFlowProportion() {
            return this.flowProportion;
        }

        public DescribeDcdnDomainTopUrlVisitResponseBodyUrl200ListUrlList setUrlDetail(String urlDetail) {
            this.urlDetail = urlDetail;
            return this;
        }
        public String getUrlDetail() {
            return this.urlDetail;
        }

        public DescribeDcdnDomainTopUrlVisitResponseBodyUrl200ListUrlList setVisitData(String visitData) {
            this.visitData = visitData;
            return this;
        }
        public String getVisitData() {
            return this.visitData;
        }

        public DescribeDcdnDomainTopUrlVisitResponseBodyUrl200ListUrlList setVisitProportion(Float visitProportion) {
            this.visitProportion = visitProportion;
            return this;
        }
        public Float getVisitProportion() {
            return this.visitProportion;
        }

    }

    public static class DescribeDcdnDomainTopUrlVisitResponseBodyUrl200List extends TeaModel {
        @NameInMap("UrlList")
        public java.util.List<DescribeDcdnDomainTopUrlVisitResponseBodyUrl200ListUrlList> urlList;

        public static DescribeDcdnDomainTopUrlVisitResponseBodyUrl200List build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainTopUrlVisitResponseBodyUrl200List self = new DescribeDcdnDomainTopUrlVisitResponseBodyUrl200List();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainTopUrlVisitResponseBodyUrl200List setUrlList(java.util.List<DescribeDcdnDomainTopUrlVisitResponseBodyUrl200ListUrlList> urlList) {
            this.urlList = urlList;
            return this;
        }
        public java.util.List<DescribeDcdnDomainTopUrlVisitResponseBodyUrl200ListUrlList> getUrlList() {
            return this.urlList;
        }

    }

    public static class DescribeDcdnDomainTopUrlVisitResponseBodyUrl300ListUrlList extends TeaModel {
        /**
         * <p>The amount of network traffic. Unit: bytes.</p>
         */
        @NameInMap("Flow")
        public String flow;

        /**
         * <p>The proportion of network traffic consumed to access the URL.</p>
         */
        @NameInMap("FlowProportion")
        public Float flowProportion;

        /**
         * <p>The complete URL.</p>
         */
        @NameInMap("UrlDetail")
        public String urlDetail;

        /**
         * <p>The number of visits to the URL.</p>
         */
        @NameInMap("VisitData")
        public String visitData;

        /**
         * <p>The proportion of visits to the URL.</p>
         */
        @NameInMap("VisitProportion")
        public Float visitProportion;

        public static DescribeDcdnDomainTopUrlVisitResponseBodyUrl300ListUrlList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainTopUrlVisitResponseBodyUrl300ListUrlList self = new DescribeDcdnDomainTopUrlVisitResponseBodyUrl300ListUrlList();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainTopUrlVisitResponseBodyUrl300ListUrlList setFlow(String flow) {
            this.flow = flow;
            return this;
        }
        public String getFlow() {
            return this.flow;
        }

        public DescribeDcdnDomainTopUrlVisitResponseBodyUrl300ListUrlList setFlowProportion(Float flowProportion) {
            this.flowProportion = flowProportion;
            return this;
        }
        public Float getFlowProportion() {
            return this.flowProportion;
        }

        public DescribeDcdnDomainTopUrlVisitResponseBodyUrl300ListUrlList setUrlDetail(String urlDetail) {
            this.urlDetail = urlDetail;
            return this;
        }
        public String getUrlDetail() {
            return this.urlDetail;
        }

        public DescribeDcdnDomainTopUrlVisitResponseBodyUrl300ListUrlList setVisitData(String visitData) {
            this.visitData = visitData;
            return this;
        }
        public String getVisitData() {
            return this.visitData;
        }

        public DescribeDcdnDomainTopUrlVisitResponseBodyUrl300ListUrlList setVisitProportion(Float visitProportion) {
            this.visitProportion = visitProportion;
            return this;
        }
        public Float getVisitProportion() {
            return this.visitProportion;
        }

    }

    public static class DescribeDcdnDomainTopUrlVisitResponseBodyUrl300List extends TeaModel {
        @NameInMap("UrlList")
        public java.util.List<DescribeDcdnDomainTopUrlVisitResponseBodyUrl300ListUrlList> urlList;

        public static DescribeDcdnDomainTopUrlVisitResponseBodyUrl300List build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainTopUrlVisitResponseBodyUrl300List self = new DescribeDcdnDomainTopUrlVisitResponseBodyUrl300List();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainTopUrlVisitResponseBodyUrl300List setUrlList(java.util.List<DescribeDcdnDomainTopUrlVisitResponseBodyUrl300ListUrlList> urlList) {
            this.urlList = urlList;
            return this;
        }
        public java.util.List<DescribeDcdnDomainTopUrlVisitResponseBodyUrl300ListUrlList> getUrlList() {
            return this.urlList;
        }

    }

    public static class DescribeDcdnDomainTopUrlVisitResponseBodyUrl400ListUrlList extends TeaModel {
        /**
         * <p>The amount of network traffic. Unit: bytes.</p>
         */
        @NameInMap("Flow")
        public String flow;

        /**
         * <p>The proportion of network traffic consumed to access the URL.</p>
         */
        @NameInMap("FlowProportion")
        public Float flowProportion;

        /**
         * <p>The complete URL.</p>
         */
        @NameInMap("UrlDetail")
        public String urlDetail;

        /**
         * <p>The number of visits to the URL.</p>
         */
        @NameInMap("VisitData")
        public String visitData;

        /**
         * <p>The proportion of visits to the URL.</p>
         */
        @NameInMap("VisitProportion")
        public Float visitProportion;

        public static DescribeDcdnDomainTopUrlVisitResponseBodyUrl400ListUrlList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainTopUrlVisitResponseBodyUrl400ListUrlList self = new DescribeDcdnDomainTopUrlVisitResponseBodyUrl400ListUrlList();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainTopUrlVisitResponseBodyUrl400ListUrlList setFlow(String flow) {
            this.flow = flow;
            return this;
        }
        public String getFlow() {
            return this.flow;
        }

        public DescribeDcdnDomainTopUrlVisitResponseBodyUrl400ListUrlList setFlowProportion(Float flowProportion) {
            this.flowProportion = flowProportion;
            return this;
        }
        public Float getFlowProportion() {
            return this.flowProportion;
        }

        public DescribeDcdnDomainTopUrlVisitResponseBodyUrl400ListUrlList setUrlDetail(String urlDetail) {
            this.urlDetail = urlDetail;
            return this;
        }
        public String getUrlDetail() {
            return this.urlDetail;
        }

        public DescribeDcdnDomainTopUrlVisitResponseBodyUrl400ListUrlList setVisitData(String visitData) {
            this.visitData = visitData;
            return this;
        }
        public String getVisitData() {
            return this.visitData;
        }

        public DescribeDcdnDomainTopUrlVisitResponseBodyUrl400ListUrlList setVisitProportion(Float visitProportion) {
            this.visitProportion = visitProportion;
            return this;
        }
        public Float getVisitProportion() {
            return this.visitProportion;
        }

    }

    public static class DescribeDcdnDomainTopUrlVisitResponseBodyUrl400List extends TeaModel {
        @NameInMap("UrlList")
        public java.util.List<DescribeDcdnDomainTopUrlVisitResponseBodyUrl400ListUrlList> urlList;

        public static DescribeDcdnDomainTopUrlVisitResponseBodyUrl400List build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainTopUrlVisitResponseBodyUrl400List self = new DescribeDcdnDomainTopUrlVisitResponseBodyUrl400List();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainTopUrlVisitResponseBodyUrl400List setUrlList(java.util.List<DescribeDcdnDomainTopUrlVisitResponseBodyUrl400ListUrlList> urlList) {
            this.urlList = urlList;
            return this;
        }
        public java.util.List<DescribeDcdnDomainTopUrlVisitResponseBodyUrl400ListUrlList> getUrlList() {
            return this.urlList;
        }

    }

    public static class DescribeDcdnDomainTopUrlVisitResponseBodyUrl500ListUrlList extends TeaModel {
        /**
         * <p>The amount of network traffic. Unit: bytes.</p>
         */
        @NameInMap("Flow")
        public String flow;

        /**
         * <p>The proportion of network traffic consumed to access the URL.</p>
         */
        @NameInMap("FlowProportion")
        public Float flowProportion;

        /**
         * <p>The complete URL.</p>
         */
        @NameInMap("UrlDetail")
        public String urlDetail;

        /**
         * <p>The number of visits to the URL.</p>
         */
        @NameInMap("VisitData")
        public String visitData;

        /**
         * <p>The proportion of visits to the URL.</p>
         */
        @NameInMap("VisitProportion")
        public Float visitProportion;

        public static DescribeDcdnDomainTopUrlVisitResponseBodyUrl500ListUrlList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainTopUrlVisitResponseBodyUrl500ListUrlList self = new DescribeDcdnDomainTopUrlVisitResponseBodyUrl500ListUrlList();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainTopUrlVisitResponseBodyUrl500ListUrlList setFlow(String flow) {
            this.flow = flow;
            return this;
        }
        public String getFlow() {
            return this.flow;
        }

        public DescribeDcdnDomainTopUrlVisitResponseBodyUrl500ListUrlList setFlowProportion(Float flowProportion) {
            this.flowProportion = flowProportion;
            return this;
        }
        public Float getFlowProportion() {
            return this.flowProportion;
        }

        public DescribeDcdnDomainTopUrlVisitResponseBodyUrl500ListUrlList setUrlDetail(String urlDetail) {
            this.urlDetail = urlDetail;
            return this;
        }
        public String getUrlDetail() {
            return this.urlDetail;
        }

        public DescribeDcdnDomainTopUrlVisitResponseBodyUrl500ListUrlList setVisitData(String visitData) {
            this.visitData = visitData;
            return this;
        }
        public String getVisitData() {
            return this.visitData;
        }

        public DescribeDcdnDomainTopUrlVisitResponseBodyUrl500ListUrlList setVisitProportion(Float visitProportion) {
            this.visitProportion = visitProportion;
            return this;
        }
        public Float getVisitProportion() {
            return this.visitProportion;
        }

    }

    public static class DescribeDcdnDomainTopUrlVisitResponseBodyUrl500List extends TeaModel {
        @NameInMap("UrlList")
        public java.util.List<DescribeDcdnDomainTopUrlVisitResponseBodyUrl500ListUrlList> urlList;

        public static DescribeDcdnDomainTopUrlVisitResponseBodyUrl500List build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainTopUrlVisitResponseBodyUrl500List self = new DescribeDcdnDomainTopUrlVisitResponseBodyUrl500List();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainTopUrlVisitResponseBodyUrl500List setUrlList(java.util.List<DescribeDcdnDomainTopUrlVisitResponseBodyUrl500ListUrlList> urlList) {
            this.urlList = urlList;
            return this;
        }
        public java.util.List<DescribeDcdnDomainTopUrlVisitResponseBodyUrl500ListUrlList> getUrlList() {
            return this.urlList;
        }

    }

}
