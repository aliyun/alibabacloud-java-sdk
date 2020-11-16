// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveTopDomainsByFlowResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("StartTime")
    @Validation(required = true)
    public String startTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public String endTime;

    @NameInMap("DomainCount")
    @Validation(required = true)
    public Long domainCount;

    @NameInMap("DomainOnlineCount")
    @Validation(required = true)
    public Long domainOnlineCount;

    @NameInMap("TopDomains")
    @Validation(required = true)
    public DescribeLiveTopDomainsByFlowResponseTopDomains topDomains;

    public static DescribeLiveTopDomainsByFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveTopDomainsByFlowResponse self = new DescribeLiveTopDomainsByFlowResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveTopDomainsByFlowResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveTopDomainsByFlowResponse setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeLiveTopDomainsByFlowResponse setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeLiveTopDomainsByFlowResponse setDomainCount(Long domainCount) {
        this.domainCount = domainCount;
        return this;
    }
    public Long getDomainCount() {
        return this.domainCount;
    }

    public DescribeLiveTopDomainsByFlowResponse setDomainOnlineCount(Long domainOnlineCount) {
        this.domainOnlineCount = domainOnlineCount;
        return this;
    }
    public Long getDomainOnlineCount() {
        return this.domainOnlineCount;
    }

    public DescribeLiveTopDomainsByFlowResponse setTopDomains(DescribeLiveTopDomainsByFlowResponseTopDomains topDomains) {
        this.topDomains = topDomains;
        return this;
    }
    public DescribeLiveTopDomainsByFlowResponseTopDomains getTopDomains() {
        return this.topDomains;
    }

    public static class DescribeLiveTopDomainsByFlowResponseTopDomainsTopDomain extends TeaModel {
        @NameInMap("DomainName")
        @Validation(required = true)
        public String domainName;

        @NameInMap("Rank")
        @Validation(required = true)
        public Long rank;

        @NameInMap("TotalTraffic")
        @Validation(required = true)
        public String totalTraffic;

        @NameInMap("TrafficPercent")
        @Validation(required = true)
        public String trafficPercent;

        @NameInMap("MaxBps")
        @Validation(required = true)
        public Long maxBps;

        @NameInMap("MaxBpsTime")
        @Validation(required = true)
        public String maxBpsTime;

        @NameInMap("TotalAccess")
        @Validation(required = true)
        public Long totalAccess;

        public static DescribeLiveTopDomainsByFlowResponseTopDomainsTopDomain build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveTopDomainsByFlowResponseTopDomainsTopDomain self = new DescribeLiveTopDomainsByFlowResponseTopDomainsTopDomain();
            return TeaModel.build(map, self);
        }

        public DescribeLiveTopDomainsByFlowResponseTopDomainsTopDomain setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLiveTopDomainsByFlowResponseTopDomainsTopDomain setRank(Long rank) {
            this.rank = rank;
            return this;
        }
        public Long getRank() {
            return this.rank;
        }

        public DescribeLiveTopDomainsByFlowResponseTopDomainsTopDomain setTotalTraffic(String totalTraffic) {
            this.totalTraffic = totalTraffic;
            return this;
        }
        public String getTotalTraffic() {
            return this.totalTraffic;
        }

        public DescribeLiveTopDomainsByFlowResponseTopDomainsTopDomain setTrafficPercent(String trafficPercent) {
            this.trafficPercent = trafficPercent;
            return this;
        }
        public String getTrafficPercent() {
            return this.trafficPercent;
        }

        public DescribeLiveTopDomainsByFlowResponseTopDomainsTopDomain setMaxBps(Long maxBps) {
            this.maxBps = maxBps;
            return this;
        }
        public Long getMaxBps() {
            return this.maxBps;
        }

        public DescribeLiveTopDomainsByFlowResponseTopDomainsTopDomain setMaxBpsTime(String maxBpsTime) {
            this.maxBpsTime = maxBpsTime;
            return this;
        }
        public String getMaxBpsTime() {
            return this.maxBpsTime;
        }

        public DescribeLiveTopDomainsByFlowResponseTopDomainsTopDomain setTotalAccess(Long totalAccess) {
            this.totalAccess = totalAccess;
            return this;
        }
        public Long getTotalAccess() {
            return this.totalAccess;
        }

    }

    public static class DescribeLiveTopDomainsByFlowResponseTopDomains extends TeaModel {
        @NameInMap("TopDomain")
        @Validation(required = true)
        public java.util.List<DescribeLiveTopDomainsByFlowResponseTopDomainsTopDomain> topDomain;

        public static DescribeLiveTopDomainsByFlowResponseTopDomains build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveTopDomainsByFlowResponseTopDomains self = new DescribeLiveTopDomainsByFlowResponseTopDomains();
            return TeaModel.build(map, self);
        }

        public DescribeLiveTopDomainsByFlowResponseTopDomains setTopDomain(java.util.List<DescribeLiveTopDomainsByFlowResponseTopDomainsTopDomain> topDomain) {
            this.topDomain = topDomain;
            return this;
        }
        public java.util.List<DescribeLiveTopDomainsByFlowResponseTopDomainsTopDomain> getTopDomain() {
            return this.topDomain;
        }

    }

}
