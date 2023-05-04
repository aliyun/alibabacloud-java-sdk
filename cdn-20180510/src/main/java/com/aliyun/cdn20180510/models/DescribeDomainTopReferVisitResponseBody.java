// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainTopReferVisitResponseBody extends TeaModel {
    /**
     * <p>The number of visits to the web page.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The proportion of the amount of network traffic consumed for visiting the web page.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The amount of network traffic. Unit: bytes.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The URLs to the most frequently requested web pages.</p>
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
         * <p>The proportion of visits to the web page.</p>
         */
        @NameInMap("Flow")
        public String flow;

        /**
         * <p>The statistical analysis feature of Alibaba Cloud CDN is no longer available. The API operations related to the statistical analysis feature are no longer maintained. We recommend that you do not use the API operations because data may be missing or inaccurate. You can use the [operations report](https://www.alibabacloud.com/help/en/alibaba-cloud-cdn/latest/customize-an-operations-report-template-and-create-a-tracking-task) feature to analyze data.  </p>
         * <br>
         * <p>> - If you do not set StartTime or EndTime, data within the last 24 hours is queried. If you set both StartTime and EndTime, data within the specified time range is queried.</p>
         * <p>- Data is collected at an interval of five minutes.</p>
         * <p>- You can call this operation up to 10 times per second per account.</p>
         */
        @NameInMap("FlowProportion")
        public Float flowProportion;

        /**
         * <p>The accelerated domain name.</p>
         */
        @NameInMap("ReferDetail")
        public String referDetail;

        /**
         * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         */
        @NameInMap("VisitData")
        public String visitData;

        /**
         * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * <br>
         * <p>The end time must be later than the start time.</p>
         */
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
