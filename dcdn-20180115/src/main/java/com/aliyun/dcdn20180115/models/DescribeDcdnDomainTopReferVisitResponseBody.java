// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainTopReferVisitResponseBody extends TeaModel {
    /**
     * <p>The accelerated domain name.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The start of the time range during which data was queried.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The list of frequently referenced URLs returned.</p>
     */
    @NameInMap("TopReferList")
    public DescribeDcdnDomainTopReferVisitResponseBodyTopReferList topReferList;

    public static DescribeDcdnDomainTopReferVisitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainTopReferVisitResponseBody self = new DescribeDcdnDomainTopReferVisitResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainTopReferVisitResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDcdnDomainTopReferVisitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnDomainTopReferVisitResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDcdnDomainTopReferVisitResponseBody setTopReferList(DescribeDcdnDomainTopReferVisitResponseBodyTopReferList topReferList) {
        this.topReferList = topReferList;
        return this;
    }
    public DescribeDcdnDomainTopReferVisitResponseBodyTopReferList getTopReferList() {
        return this.topReferList;
    }

    public static class DescribeDcdnDomainTopReferVisitResponseBodyTopReferListReferList extends TeaModel {
        /**
         * <p>The amount of network traffic. (Unit: bytes)</p>
         */
        @NameInMap("Flow")
        public String flow;

        /**
         * <p>The proportion of network traffic consumed to access the URL.</p>
         */
        @NameInMap("FlowProportion")
        public Float flowProportion;

        /**
         * <p>The complete referenced URL.</p>
         */
        @NameInMap("ReferDetail")
        public String referDetail;

        /**
         * <p>The number of visits.</p>
         */
        @NameInMap("VisitData")
        public String visitData;

        /**
         * <p>The proportion of visits to the URL.</p>
         */
        @NameInMap("VisitProportion")
        public Float visitProportion;

        public static DescribeDcdnDomainTopReferVisitResponseBodyTopReferListReferList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainTopReferVisitResponseBodyTopReferListReferList self = new DescribeDcdnDomainTopReferVisitResponseBodyTopReferListReferList();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainTopReferVisitResponseBodyTopReferListReferList setFlow(String flow) {
            this.flow = flow;
            return this;
        }
        public String getFlow() {
            return this.flow;
        }

        public DescribeDcdnDomainTopReferVisitResponseBodyTopReferListReferList setFlowProportion(Float flowProportion) {
            this.flowProportion = flowProportion;
            return this;
        }
        public Float getFlowProportion() {
            return this.flowProportion;
        }

        public DescribeDcdnDomainTopReferVisitResponseBodyTopReferListReferList setReferDetail(String referDetail) {
            this.referDetail = referDetail;
            return this;
        }
        public String getReferDetail() {
            return this.referDetail;
        }

        public DescribeDcdnDomainTopReferVisitResponseBodyTopReferListReferList setVisitData(String visitData) {
            this.visitData = visitData;
            return this;
        }
        public String getVisitData() {
            return this.visitData;
        }

        public DescribeDcdnDomainTopReferVisitResponseBodyTopReferListReferList setVisitProportion(Float visitProportion) {
            this.visitProportion = visitProportion;
            return this;
        }
        public Float getVisitProportion() {
            return this.visitProportion;
        }

    }

    public static class DescribeDcdnDomainTopReferVisitResponseBodyTopReferList extends TeaModel {
        @NameInMap("ReferList")
        public java.util.List<DescribeDcdnDomainTopReferVisitResponseBodyTopReferListReferList> referList;

        public static DescribeDcdnDomainTopReferVisitResponseBodyTopReferList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainTopReferVisitResponseBodyTopReferList self = new DescribeDcdnDomainTopReferVisitResponseBodyTopReferList();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainTopReferVisitResponseBodyTopReferList setReferList(java.util.List<DescribeDcdnDomainTopReferVisitResponseBodyTopReferListReferList> referList) {
            this.referList = referList;
            return this;
        }
        public java.util.List<DescribeDcdnDomainTopReferVisitResponseBodyTopReferListReferList> getReferList() {
            return this.referList;
        }

    }

}
