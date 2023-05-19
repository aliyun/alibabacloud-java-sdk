// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainTopClientIpVisitResponseBody extends TeaModel {
    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <br>
     * <p>The end time must be later than the start time.</p>
     */
    @NameInMap("ClientIpList")
    public java.util.List<DescribeDomainTopClientIpVisitResponseBodyClientIpList> clientIpList;

    /**
     * <p>The accelerated domain name. Separate multiple accelerated domain names with commas (,).</p>
     * <br>
     * <p>By default, this operation queries client IP addresses for all accelerated domain names.</p>
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
         * <p>Queries client IP addresses that are ranked by the number of requests or the amount of network traffic within a specific time range for one or more accelerated domain names. You can query data collected within the last 90 days.</p>
         */
        @NameInMap("Acc")
        public Long acc;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("ClientIp")
        public String clientIp;

        /**
         * <p>The total amount of network traffic consumed. Unit: bytes.</p>
         */
        @NameInMap("Rank")
        public Integer rank;

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
