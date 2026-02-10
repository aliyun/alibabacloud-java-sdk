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
        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("MaxBps")
        public Long maxBps;

        @NameInMap("MaxBpsTime")
        public String maxBpsTime;

        @NameInMap("Rank")
        public Long rank;

        @NameInMap("TotalAccess")
        public Long totalAccess;

        @NameInMap("TotalTraffic")
        public String totalTraffic;

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
