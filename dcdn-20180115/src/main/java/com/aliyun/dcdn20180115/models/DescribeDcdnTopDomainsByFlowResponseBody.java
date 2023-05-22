// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnTopDomainsByFlowResponseBody extends TeaModel {
    /**
     * <p>The total number of accelerated domains under your account.</p>
     */
    @NameInMap("DomainCount")
    public Long domainCount;

    /**
     * <p>The total number of accelerated domains that are in the **Enabled** state under your account.</p>
     */
    @NameInMap("DomainOnlineCount")
    public Long domainOnlineCount;

    /**
     * <p>The end of the time range during which data was queried.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The beginning of the time range during which data was queried.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The top N domain names ranked by network traffic.</p>
     */
    @NameInMap("TopDomains")
    public DescribeDcdnTopDomainsByFlowResponseBodyTopDomains topDomains;

    public static DescribeDcdnTopDomainsByFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnTopDomainsByFlowResponseBody self = new DescribeDcdnTopDomainsByFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnTopDomainsByFlowResponseBody setDomainCount(Long domainCount) {
        this.domainCount = domainCount;
        return this;
    }
    public Long getDomainCount() {
        return this.domainCount;
    }

    public DescribeDcdnTopDomainsByFlowResponseBody setDomainOnlineCount(Long domainOnlineCount) {
        this.domainOnlineCount = domainOnlineCount;
        return this;
    }
    public Long getDomainOnlineCount() {
        return this.domainOnlineCount;
    }

    public DescribeDcdnTopDomainsByFlowResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDcdnTopDomainsByFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnTopDomainsByFlowResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDcdnTopDomainsByFlowResponseBody setTopDomains(DescribeDcdnTopDomainsByFlowResponseBodyTopDomains topDomains) {
        this.topDomains = topDomains;
        return this;
    }
    public DescribeDcdnTopDomainsByFlowResponseBodyTopDomains getTopDomains() {
        return this.topDomains;
    }

    public static class DescribeDcdnTopDomainsByFlowResponseBodyTopDomainsTopDomain extends TeaModel {
        /**
         * <p>The domain name.</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The peak bandwidth value.</p>
         */
        @NameInMap("MaxBps")
        public Long maxBps;

        /**
         * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("MaxBpsTime")
        public String maxBpsTime;

        /**
         * <p>The ranking of the accelerated domain name.</p>
         */
        @NameInMap("Rank")
        public Long rank;

        /**
         * <p>The number of visits to the URL.</p>
         */
        @NameInMap("TotalAccess")
        public Long totalAccess;

        /**
         * <p>The total volume of traffic.</p>
         */
        @NameInMap("TotalTraffic")
        public String totalTraffic;

        /**
         * <p>The proportion of network traffic consumed to access the URL.</p>
         */
        @NameInMap("TrafficPercent")
        public String trafficPercent;

        public static DescribeDcdnTopDomainsByFlowResponseBodyTopDomainsTopDomain build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnTopDomainsByFlowResponseBodyTopDomainsTopDomain self = new DescribeDcdnTopDomainsByFlowResponseBodyTopDomainsTopDomain();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnTopDomainsByFlowResponseBodyTopDomainsTopDomain setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeDcdnTopDomainsByFlowResponseBodyTopDomainsTopDomain setMaxBps(Long maxBps) {
            this.maxBps = maxBps;
            return this;
        }
        public Long getMaxBps() {
            return this.maxBps;
        }

        public DescribeDcdnTopDomainsByFlowResponseBodyTopDomainsTopDomain setMaxBpsTime(String maxBpsTime) {
            this.maxBpsTime = maxBpsTime;
            return this;
        }
        public String getMaxBpsTime() {
            return this.maxBpsTime;
        }

        public DescribeDcdnTopDomainsByFlowResponseBodyTopDomainsTopDomain setRank(Long rank) {
            this.rank = rank;
            return this;
        }
        public Long getRank() {
            return this.rank;
        }

        public DescribeDcdnTopDomainsByFlowResponseBodyTopDomainsTopDomain setTotalAccess(Long totalAccess) {
            this.totalAccess = totalAccess;
            return this;
        }
        public Long getTotalAccess() {
            return this.totalAccess;
        }

        public DescribeDcdnTopDomainsByFlowResponseBodyTopDomainsTopDomain setTotalTraffic(String totalTraffic) {
            this.totalTraffic = totalTraffic;
            return this;
        }
        public String getTotalTraffic() {
            return this.totalTraffic;
        }

        public DescribeDcdnTopDomainsByFlowResponseBodyTopDomainsTopDomain setTrafficPercent(String trafficPercent) {
            this.trafficPercent = trafficPercent;
            return this;
        }
        public String getTrafficPercent() {
            return this.trafficPercent;
        }

    }

    public static class DescribeDcdnTopDomainsByFlowResponseBodyTopDomains extends TeaModel {
        @NameInMap("TopDomain")
        public java.util.List<DescribeDcdnTopDomainsByFlowResponseBodyTopDomainsTopDomain> topDomain;

        public static DescribeDcdnTopDomainsByFlowResponseBodyTopDomains build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnTopDomainsByFlowResponseBodyTopDomains self = new DescribeDcdnTopDomainsByFlowResponseBodyTopDomains();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnTopDomainsByFlowResponseBodyTopDomains setTopDomain(java.util.List<DescribeDcdnTopDomainsByFlowResponseBodyTopDomainsTopDomain> topDomain) {
            this.topDomain = topDomain;
            return this;
        }
        public java.util.List<DescribeDcdnTopDomainsByFlowResponseBodyTopDomainsTopDomain> getTopDomain() {
            return this.topDomain;
        }

    }

}
