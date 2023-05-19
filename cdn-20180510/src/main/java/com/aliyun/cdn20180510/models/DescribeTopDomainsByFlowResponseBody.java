// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeTopDomainsByFlowResponseBody extends TeaModel {
    /**
     * <p>The number of visits to the accelerated domain name.</p>
     */
    @NameInMap("DomainCount")
    public Long domainCount;

    /**
     * <p>The ranking of the accelerated domain name.</p>
     */
    @NameInMap("DomainOnlineCount")
    public Long domainOnlineCount;

    /**
     * <p>The operation that you want to perform. Set the value to **DescribeTopDomainsByFlow**.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The proportion of the amount of network traffic consumed for visiting the web page.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total amount of network traffic.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The end of the time range during which data was queried.</p>
     */
    @NameInMap("TopDomains")
    public DescribeTopDomainsByFlowResponseBodyTopDomains topDomains;

    public static DescribeTopDomainsByFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTopDomainsByFlowResponseBody self = new DescribeTopDomainsByFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTopDomainsByFlowResponseBody setDomainCount(Long domainCount) {
        this.domainCount = domainCount;
        return this;
    }
    public Long getDomainCount() {
        return this.domainCount;
    }

    public DescribeTopDomainsByFlowResponseBody setDomainOnlineCount(Long domainOnlineCount) {
        this.domainOnlineCount = domainOnlineCount;
        return this;
    }
    public Long getDomainOnlineCount() {
        return this.domainOnlineCount;
    }

    public DescribeTopDomainsByFlowResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeTopDomainsByFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTopDomainsByFlowResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeTopDomainsByFlowResponseBody setTopDomains(DescribeTopDomainsByFlowResponseBodyTopDomains topDomains) {
        this.topDomains = topDomains;
        return this;
    }
    public DescribeTopDomainsByFlowResponseBodyTopDomains getTopDomains() {
        return this.topDomains;
    }

    public static class DescribeTopDomainsByFlowResponseBodyTopDomainsTopDomain extends TeaModel {
        /**
         * <p>The total number of accelerated domain names that belong to the current Alibaba Cloud account.</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * <br>
         * <p>>  Set StartTime to UTC time in the yyyy-MM-ddTHH:mm:ssZ format. For example, if the local time is 00:00, June 1, 2021, set StartTime to 2021-05-31T16:00:00Z.</p>
         */
        @NameInMap("MaxBps")
        public Float maxBps;

        /**
         * <p>Queries the top N domain names ranked by network traffic. You can query data collected within the last 30 days.</p>
         */
        @NameInMap("MaxBpsTime")
        public String maxBpsTime;

        /**
         * <p>The time when the bandwidth reached the peak value.</p>
         */
        @NameInMap("Rank")
        public Long rank;

        /**
         * <p>The top N domain names ranked by network traffic.</p>
         */
        @NameInMap("TotalAccess")
        public Long totalAccess;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("TotalTraffic")
        public String totalTraffic;

        /**
         * <p>The beginning of the time range during which data was queried.</p>
         */
        @NameInMap("TrafficPercent")
        public String trafficPercent;

        public static DescribeTopDomainsByFlowResponseBodyTopDomainsTopDomain build(java.util.Map<String, ?> map) throws Exception {
            DescribeTopDomainsByFlowResponseBodyTopDomainsTopDomain self = new DescribeTopDomainsByFlowResponseBodyTopDomainsTopDomain();
            return TeaModel.build(map, self);
        }

        public DescribeTopDomainsByFlowResponseBodyTopDomainsTopDomain setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeTopDomainsByFlowResponseBodyTopDomainsTopDomain setMaxBps(Float maxBps) {
            this.maxBps = maxBps;
            return this;
        }
        public Float getMaxBps() {
            return this.maxBps;
        }

        public DescribeTopDomainsByFlowResponseBodyTopDomainsTopDomain setMaxBpsTime(String maxBpsTime) {
            this.maxBpsTime = maxBpsTime;
            return this;
        }
        public String getMaxBpsTime() {
            return this.maxBpsTime;
        }

        public DescribeTopDomainsByFlowResponseBodyTopDomainsTopDomain setRank(Long rank) {
            this.rank = rank;
            return this;
        }
        public Long getRank() {
            return this.rank;
        }

        public DescribeTopDomainsByFlowResponseBodyTopDomainsTopDomain setTotalAccess(Long totalAccess) {
            this.totalAccess = totalAccess;
            return this;
        }
        public Long getTotalAccess() {
            return this.totalAccess;
        }

        public DescribeTopDomainsByFlowResponseBodyTopDomainsTopDomain setTotalTraffic(String totalTraffic) {
            this.totalTraffic = totalTraffic;
            return this;
        }
        public String getTotalTraffic() {
            return this.totalTraffic;
        }

        public DescribeTopDomainsByFlowResponseBodyTopDomainsTopDomain setTrafficPercent(String trafficPercent) {
            this.trafficPercent = trafficPercent;
            return this;
        }
        public String getTrafficPercent() {
            return this.trafficPercent;
        }

    }

    public static class DescribeTopDomainsByFlowResponseBodyTopDomains extends TeaModel {
        @NameInMap("TopDomain")
        public java.util.List<DescribeTopDomainsByFlowResponseBodyTopDomainsTopDomain> topDomain;

        public static DescribeTopDomainsByFlowResponseBodyTopDomains build(java.util.Map<String, ?> map) throws Exception {
            DescribeTopDomainsByFlowResponseBodyTopDomains self = new DescribeTopDomainsByFlowResponseBodyTopDomains();
            return TeaModel.build(map, self);
        }

        public DescribeTopDomainsByFlowResponseBodyTopDomains setTopDomain(java.util.List<DescribeTopDomainsByFlowResponseBodyTopDomainsTopDomain> topDomain) {
            this.topDomain = topDomain;
            return this;
        }
        public java.util.List<DescribeTopDomainsByFlowResponseBodyTopDomainsTopDomain> getTopDomain() {
            return this.topDomain;
        }

    }

}
