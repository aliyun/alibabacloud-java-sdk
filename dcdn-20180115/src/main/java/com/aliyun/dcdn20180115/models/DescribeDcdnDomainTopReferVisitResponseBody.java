// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainTopReferVisitResponseBody extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StartTime")
    public String startTime;

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
        @NameInMap("Flow")
        public String flow;

        @NameInMap("FlowProportion")
        public Float flowProportion;

        @NameInMap("ReferDetail")
        public String referDetail;

        @NameInMap("VisitData")
        public String visitData;

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
