// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainTopReferVisitResponseBody extends TeaModel {
    // The accelerated domain name.
    @NameInMap("DomainName")
    public String domainName;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The beginning of the time range that was queried.
    @NameInMap("StartTime")
    public String startTime;

    // The most frequently requested web pages.
    @NameInMap("TopReferList")
    public DescribeDomainTopReferVisitResponseBodyTopReferList topReferList;

    public static DescribeDomainTopReferVisitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainTopReferVisitResponseBody self = new DescribeDomainTopReferVisitResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainTopReferVisitResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainTopReferVisitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainTopReferVisitResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDomainTopReferVisitResponseBody setTopReferList(DescribeDomainTopReferVisitResponseBodyTopReferList topReferList) {
        this.topReferList = topReferList;
        return this;
    }
    public DescribeDomainTopReferVisitResponseBodyTopReferList getTopReferList() {
        return this.topReferList;
    }

    public static class DescribeDomainTopReferVisitResponseBodyTopReferListReferList extends TeaModel {
        // The amount of network traffic. Unit: bytes.
        @NameInMap("Flow")
        public String flow;

        // The proportion of the amount of network traffic consumed for visiting the web page.
        @NameInMap("FlowProportion")
        public Float flowProportion;

        // The URLs to the most frequently requested web pages.
        @NameInMap("ReferDetail")
        public String referDetail;

        // The number of visits to the web page.
        @NameInMap("VisitData")
        public String visitData;

        // The proportion of visits to the web page.
        @NameInMap("VisitProportion")
        public Float visitProportion;

        public static DescribeDomainTopReferVisitResponseBodyTopReferListReferList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainTopReferVisitResponseBodyTopReferListReferList self = new DescribeDomainTopReferVisitResponseBodyTopReferListReferList();
            return TeaModel.build(map, self);
        }

        public DescribeDomainTopReferVisitResponseBodyTopReferListReferList setFlow(String flow) {
            this.flow = flow;
            return this;
        }
        public String getFlow() {
            return this.flow;
        }

        public DescribeDomainTopReferVisitResponseBodyTopReferListReferList setFlowProportion(Float flowProportion) {
            this.flowProportion = flowProportion;
            return this;
        }
        public Float getFlowProportion() {
            return this.flowProportion;
        }

        public DescribeDomainTopReferVisitResponseBodyTopReferListReferList setReferDetail(String referDetail) {
            this.referDetail = referDetail;
            return this;
        }
        public String getReferDetail() {
            return this.referDetail;
        }

        public DescribeDomainTopReferVisitResponseBodyTopReferListReferList setVisitData(String visitData) {
            this.visitData = visitData;
            return this;
        }
        public String getVisitData() {
            return this.visitData;
        }

        public DescribeDomainTopReferVisitResponseBodyTopReferListReferList setVisitProportion(Float visitProportion) {
            this.visitProportion = visitProportion;
            return this;
        }
        public Float getVisitProportion() {
            return this.visitProportion;
        }

    }

    public static class DescribeDomainTopReferVisitResponseBodyTopReferList extends TeaModel {
        @NameInMap("ReferList")
        public java.util.List<DescribeDomainTopReferVisitResponseBodyTopReferListReferList> referList;

        public static DescribeDomainTopReferVisitResponseBodyTopReferList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainTopReferVisitResponseBodyTopReferList self = new DescribeDomainTopReferVisitResponseBodyTopReferList();
            return TeaModel.build(map, self);
        }

        public DescribeDomainTopReferVisitResponseBodyTopReferList setReferList(java.util.List<DescribeDomainTopReferVisitResponseBodyTopReferListReferList> referList) {
            this.referList = referList;
            return this;
        }
        public java.util.List<DescribeDomainTopReferVisitResponseBodyTopReferListReferList> getReferList() {
            return this.referList;
        }

    }

}
