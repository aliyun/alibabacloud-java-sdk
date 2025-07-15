// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveTopDomainsByFlowResponseBody extends TeaModel {
    /**
     * <p>The total number of domain names in your account.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DomainCount")
    public Long domainCount;

    /**
     * <p>The total number of domain names that are in the Enabled state in your account.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DomainOnlineCount")
    public Long domainOnlineCount;

    /**
     * <p>The end of the time range for which data was queried.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-03-20T16:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>33834C3E-388E-5FFE-A8AE-63575035C064</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The beginning of the time range for which data was queried.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-03-17T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The top domain names ranked by traffic.</p>
     */
    @NameInMap("TopDomains")
    public DescribeLiveTopDomainsByFlowResponseBodyTopDomains topDomains;

    public static DescribeLiveTopDomainsByFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveTopDomainsByFlowResponseBody self = new DescribeLiveTopDomainsByFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveTopDomainsByFlowResponseBody setDomainCount(Long domainCount) {
        this.domainCount = domainCount;
        return this;
    }
    public Long getDomainCount() {
        return this.domainCount;
    }

    public DescribeLiveTopDomainsByFlowResponseBody setDomainOnlineCount(Long domainOnlineCount) {
        this.domainOnlineCount = domainOnlineCount;
        return this;
    }
    public Long getDomainOnlineCount() {
        return this.domainOnlineCount;
    }

    public DescribeLiveTopDomainsByFlowResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeLiveTopDomainsByFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveTopDomainsByFlowResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeLiveTopDomainsByFlowResponseBody setTopDomains(DescribeLiveTopDomainsByFlowResponseBodyTopDomains topDomains) {
        this.topDomains = topDomains;
        return this;
    }
    public DescribeLiveTopDomainsByFlowResponseBodyTopDomains getTopDomains() {
        return this.topDomains;
    }

    public static class DescribeLiveTopDomainsByFlowResponseBodyTopDomainsTopDomain extends TeaModel {
        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The peak bandwidth of the domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>22139626</p>
         */
        @NameInMap("MaxBps")
        public Long maxBps;

        /**
         * <p>The time when the bandwidth reached the peak value.</p>
         * 
         * <strong>example:</strong>
         * <p>1457111400</p>
         */
        @NameInMap("MaxBpsTime")
        public String maxBpsTime;

        /**
         * <p>The ranking of the domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Rank")
        public Long rank;

        /**
         * <p>The number of visits to the domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>107784230</p>
         */
        @NameInMap("TotalAccess")
        public Long totalAccess;

        /**
         * <p>The total traffic.</p>
         * 
         * <strong>example:</strong>
         * <p>2043859876683.9001</p>
         */
        @NameInMap("TotalTraffic")
        public String totalTraffic;

        /**
         * <p>The traffic share of the domain name relative to the total traffic.</p>
         * 
         * <strong>example:</strong>
         * <p>30.64191989360235</p>
         */
        @NameInMap("TrafficPercent")
        public String trafficPercent;

        public static DescribeLiveTopDomainsByFlowResponseBodyTopDomainsTopDomain build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveTopDomainsByFlowResponseBodyTopDomainsTopDomain self = new DescribeLiveTopDomainsByFlowResponseBodyTopDomainsTopDomain();
            return TeaModel.build(map, self);
        }

        public DescribeLiveTopDomainsByFlowResponseBodyTopDomainsTopDomain setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLiveTopDomainsByFlowResponseBodyTopDomainsTopDomain setMaxBps(Long maxBps) {
            this.maxBps = maxBps;
            return this;
        }
        public Long getMaxBps() {
            return this.maxBps;
        }

        public DescribeLiveTopDomainsByFlowResponseBodyTopDomainsTopDomain setMaxBpsTime(String maxBpsTime) {
            this.maxBpsTime = maxBpsTime;
            return this;
        }
        public String getMaxBpsTime() {
            return this.maxBpsTime;
        }

        public DescribeLiveTopDomainsByFlowResponseBodyTopDomainsTopDomain setRank(Long rank) {
            this.rank = rank;
            return this;
        }
        public Long getRank() {
            return this.rank;
        }

        public DescribeLiveTopDomainsByFlowResponseBodyTopDomainsTopDomain setTotalAccess(Long totalAccess) {
            this.totalAccess = totalAccess;
            return this;
        }
        public Long getTotalAccess() {
            return this.totalAccess;
        }

        public DescribeLiveTopDomainsByFlowResponseBodyTopDomainsTopDomain setTotalTraffic(String totalTraffic) {
            this.totalTraffic = totalTraffic;
            return this;
        }
        public String getTotalTraffic() {
            return this.totalTraffic;
        }

        public DescribeLiveTopDomainsByFlowResponseBodyTopDomainsTopDomain setTrafficPercent(String trafficPercent) {
            this.trafficPercent = trafficPercent;
            return this;
        }
        public String getTrafficPercent() {
            return this.trafficPercent;
        }

    }

    public static class DescribeLiveTopDomainsByFlowResponseBodyTopDomains extends TeaModel {
        @NameInMap("TopDomain")
        public java.util.List<DescribeLiveTopDomainsByFlowResponseBodyTopDomainsTopDomain> topDomain;

        public static DescribeLiveTopDomainsByFlowResponseBodyTopDomains build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveTopDomainsByFlowResponseBodyTopDomains self = new DescribeLiveTopDomainsByFlowResponseBodyTopDomains();
            return TeaModel.build(map, self);
        }

        public DescribeLiveTopDomainsByFlowResponseBodyTopDomains setTopDomain(java.util.List<DescribeLiveTopDomainsByFlowResponseBodyTopDomainsTopDomain> topDomain) {
            this.topDomain = topDomain;
            return this;
        }
        public java.util.List<DescribeLiveTopDomainsByFlowResponseBodyTopDomainsTopDomain> getTopDomain() {
            return this.topDomain;
        }

    }

}
