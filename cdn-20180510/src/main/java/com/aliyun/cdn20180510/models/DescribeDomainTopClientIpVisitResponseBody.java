// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainTopClientIpVisitResponseBody extends TeaModel {
    /**
     * <p>The client IP address returned. Only IPv4 addressed are supported.</p>
     */
    @NameInMap("ClientIpList")
    public java.util.List<DescribeDomainTopClientIpVisitResponseBodyClientIpList> clientIpList;

    /**
     * <p>The ranking of the client IP address returned.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDomainTopClientIpVisitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainTopClientIpVisitResponseBody self = new DescribeDomainTopClientIpVisitResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainTopClientIpVisitResponseBody setClientIpList(java.util.List<DescribeDomainTopClientIpVisitResponseBodyClientIpList> clientIpList) {
        this.clientIpList = clientIpList;
        return this;
    }
    public java.util.List<DescribeDomainTopClientIpVisitResponseBodyClientIpList> getClientIpList() {
        return this.clientIpList;
    }

    public DescribeDomainTopClientIpVisitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDomainTopClientIpVisitResponseBodyClientIpList extends TeaModel {
        /**
         * <p>The statistical analysis feature of Alibaba Cloud CDN is no longer available. The API operations related to the statistical analysis feature are no longer maintained. We recommend that you do not use the API operations because data may be missing or inaccurate. You can use the [operations report](https://www.alibabacloud.com/help/en/alibaba-cloud-cdn/latest/customize-an-operations-report-template-and-create-a-tracking-task) feature to for data analysis.  </p>
         * <br>
         * <p>> - If you do not set StartTime or EndTime, data collected within the last 24 hours is queried. If you set both StartTime and EndTime, data collected within the specified time range is queried.</p>
         * <p>- Data is collected every hour.</p>
         * <p>- You can call this operation up to 10 times per second per account.</p>
         */
        @NameInMap("Acc")
        public Long acc;

        /**
         * <p>The total amount of network traffic consumed. Unit: bytes.</p>
         */
        @NameInMap("ClientIp")
        public String clientIp;

        /**
         * <p>The total number of requests.</p>
         */
        @NameInMap("Rank")
        public Integer rank;

        /**
         * <p>The total number of requests.</p>
         */
        @NameInMap("Traffic")
        public Long traffic;

        public static DescribeDomainTopClientIpVisitResponseBodyClientIpList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainTopClientIpVisitResponseBodyClientIpList self = new DescribeDomainTopClientIpVisitResponseBodyClientIpList();
            return TeaModel.build(map, self);
        }

        public DescribeDomainTopClientIpVisitResponseBodyClientIpList setAcc(Long acc) {
            this.acc = acc;
            return this;
        }
        public Long getAcc() {
            return this.acc;
        }

        public DescribeDomainTopClientIpVisitResponseBodyClientIpList setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public DescribeDomainTopClientIpVisitResponseBodyClientIpList setRank(Integer rank) {
            this.rank = rank;
            return this;
        }
        public Integer getRank() {
            return this.rank;
        }

        public DescribeDomainTopClientIpVisitResponseBodyClientIpList setTraffic(Long traffic) {
            this.traffic = traffic;
            return this;
        }
        public Long getTraffic() {
            return this.traffic;
        }

    }

}
