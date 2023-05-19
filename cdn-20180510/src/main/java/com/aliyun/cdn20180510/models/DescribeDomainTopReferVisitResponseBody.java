// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainTopReferVisitResponseBody extends TeaModel {
    /**
     * <p>The sorting method. Valid values:</p>
     * <br>
     * <p>*   **traf**: by network traffic.</p>
     * <p>*   **pv**: by the number of page views. This is the default value.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The URLs to the most frequently requested web pages.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The beginning of the time range that was queried.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The amount of network traffic. Unit: bytes.</p>
     */
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
        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("Flow")
        public String flow;

        /**
         * <p>The proportion of the amount of network traffic consumed for visiting the web page.</p>
         */
        @NameInMap("FlowProportion")
        public Float flowProportion;

        /**
         * <p>Queries frequently requested web pages of one or more accelerated domain names on a specified day and sorts the web pages. You can query data collected within the last 90 days.</p>
         */
        @NameInMap("ReferDetail")
        public String referDetail;

        /**
         * <p>The proportion of visits to the web page.</p>
         */
        @NameInMap("VisitData")
        public String visitData;

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
