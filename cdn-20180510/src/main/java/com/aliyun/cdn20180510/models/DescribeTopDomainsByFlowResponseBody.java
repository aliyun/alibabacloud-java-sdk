// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeTopDomainsByFlowResponseBody extends TeaModel {
    /**
     * <p>The total number of accelerated domain names that belong to the current Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>68</p>
     */
    @NameInMap("DomainCount")
    public Long domainCount;

    /**
     * <p>The total number of accelerated domain names that are in the <strong>Enabled</strong> state within the current Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>68</p>
     */
    @NameInMap("DomainOnlineCount")
    public Long domainOnlineCount;

    /**
     * <p>The end of the time range during which data was queried.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-12-23T08:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>4E09C5D7-E1CF-4CAA-A45E-8727F4C8FD70</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The start of the time range during which data was queried.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-12-22T08:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

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
        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("MaxBps")
        public Float maxBps;

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
