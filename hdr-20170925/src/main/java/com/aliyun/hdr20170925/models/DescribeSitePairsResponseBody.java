// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeSitePairsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SitePairs")
    public DescribeSitePairsResponseBodySitePairs sitePairs;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeSitePairsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSitePairsResponseBody self = new DescribeSitePairsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSitePairsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSitePairsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSitePairsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSitePairsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSitePairsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSitePairsResponseBody setSitePairs(DescribeSitePairsResponseBodySitePairs sitePairs) {
        this.sitePairs = sitePairs;
        return this;
    }
    public DescribeSitePairsResponseBodySitePairs getSitePairs() {
        return this.sitePairs;
    }

    public DescribeSitePairsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeSitePairsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSitePairsResponseBodySitePairsSitePairReplicationStatistics extends TeaModel {
        @NameInMap("Critical")
        public Long critical;

        @NameInMap("Healthy")
        public Long healthy;

        @NameInMap("NotApplicable")
        public Long notApplicable;

        @NameInMap("Warning")
        public Long warning;

        public static DescribeSitePairsResponseBodySitePairsSitePairReplicationStatistics build(java.util.Map<String, ?> map) throws Exception {
            DescribeSitePairsResponseBodySitePairsSitePairReplicationStatistics self = new DescribeSitePairsResponseBodySitePairsSitePairReplicationStatistics();
            return TeaModel.build(map, self);
        }

        public DescribeSitePairsResponseBodySitePairsSitePairReplicationStatistics setCritical(Long critical) {
            this.critical = critical;
            return this;
        }
        public Long getCritical() {
            return this.critical;
        }

        public DescribeSitePairsResponseBodySitePairsSitePairReplicationStatistics setHealthy(Long healthy) {
            this.healthy = healthy;
            return this;
        }
        public Long getHealthy() {
            return this.healthy;
        }

        public DescribeSitePairsResponseBodySitePairsSitePairReplicationStatistics setNotApplicable(Long notApplicable) {
            this.notApplicable = notApplicable;
            return this;
        }
        public Long getNotApplicable() {
            return this.notApplicable;
        }

        public DescribeSitePairsResponseBodySitePairsSitePairReplicationStatistics setWarning(Long warning) {
            this.warning = warning;
            return this;
        }
        public Long getWarning() {
            return this.warning;
        }

    }

    public static class DescribeSitePairsResponseBodySitePairsSitePair extends TeaModel {
        @NameInMap("CloudSiteName")
        public String cloudSiteName;

        @NameInMap("CreatedTime")
        public Long createdTime;

        @NameInMap("LocalSiteName")
        public String localSiteName;

        @NameInMap("PrimarySiteId")
        public String primarySiteId;

        @NameInMap("PrimarySiteName")
        public String primarySiteName;

        @NameInMap("ReplicationStatistics")
        public DescribeSitePairsResponseBodySitePairsSitePairReplicationStatistics replicationStatistics;

        @NameInMap("SecondarySiteId")
        public String secondarySiteId;

        @NameInMap("SecondarySiteName")
        public String secondarySiteName;

        @NameInMap("ServerCount")
        public Integer serverCount;

        @NameInMap("SitePairId")
        public String sitePairId;

        @NameInMap("SitePairType")
        public String sitePairType;

        @NameInMap("Version")
        public String version;

        public static DescribeSitePairsResponseBodySitePairsSitePair build(java.util.Map<String, ?> map) throws Exception {
            DescribeSitePairsResponseBodySitePairsSitePair self = new DescribeSitePairsResponseBodySitePairsSitePair();
            return TeaModel.build(map, self);
        }

        public DescribeSitePairsResponseBodySitePairsSitePair setCloudSiteName(String cloudSiteName) {
            this.cloudSiteName = cloudSiteName;
            return this;
        }
        public String getCloudSiteName() {
            return this.cloudSiteName;
        }

        public DescribeSitePairsResponseBodySitePairsSitePair setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public DescribeSitePairsResponseBodySitePairsSitePair setLocalSiteName(String localSiteName) {
            this.localSiteName = localSiteName;
            return this;
        }
        public String getLocalSiteName() {
            return this.localSiteName;
        }

        public DescribeSitePairsResponseBodySitePairsSitePair setPrimarySiteId(String primarySiteId) {
            this.primarySiteId = primarySiteId;
            return this;
        }
        public String getPrimarySiteId() {
            return this.primarySiteId;
        }

        public DescribeSitePairsResponseBodySitePairsSitePair setPrimarySiteName(String primarySiteName) {
            this.primarySiteName = primarySiteName;
            return this;
        }
        public String getPrimarySiteName() {
            return this.primarySiteName;
        }

        public DescribeSitePairsResponseBodySitePairsSitePair setReplicationStatistics(DescribeSitePairsResponseBodySitePairsSitePairReplicationStatistics replicationStatistics) {
            this.replicationStatistics = replicationStatistics;
            return this;
        }
        public DescribeSitePairsResponseBodySitePairsSitePairReplicationStatistics getReplicationStatistics() {
            return this.replicationStatistics;
        }

        public DescribeSitePairsResponseBodySitePairsSitePair setSecondarySiteId(String secondarySiteId) {
            this.secondarySiteId = secondarySiteId;
            return this;
        }
        public String getSecondarySiteId() {
            return this.secondarySiteId;
        }

        public DescribeSitePairsResponseBodySitePairsSitePair setSecondarySiteName(String secondarySiteName) {
            this.secondarySiteName = secondarySiteName;
            return this;
        }
        public String getSecondarySiteName() {
            return this.secondarySiteName;
        }

        public DescribeSitePairsResponseBodySitePairsSitePair setServerCount(Integer serverCount) {
            this.serverCount = serverCount;
            return this;
        }
        public Integer getServerCount() {
            return this.serverCount;
        }

        public DescribeSitePairsResponseBodySitePairsSitePair setSitePairId(String sitePairId) {
            this.sitePairId = sitePairId;
            return this;
        }
        public String getSitePairId() {
            return this.sitePairId;
        }

        public DescribeSitePairsResponseBodySitePairsSitePair setSitePairType(String sitePairType) {
            this.sitePairType = sitePairType;
            return this;
        }
        public String getSitePairType() {
            return this.sitePairType;
        }

        public DescribeSitePairsResponseBodySitePairsSitePair setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeSitePairsResponseBodySitePairs extends TeaModel {
        @NameInMap("sitePair")
        public java.util.List<DescribeSitePairsResponseBodySitePairsSitePair> sitePair;

        public static DescribeSitePairsResponseBodySitePairs build(java.util.Map<String, ?> map) throws Exception {
            DescribeSitePairsResponseBodySitePairs self = new DescribeSitePairsResponseBodySitePairs();
            return TeaModel.build(map, self);
        }

        public DescribeSitePairsResponseBodySitePairs setSitePair(java.util.List<DescribeSitePairsResponseBodySitePairsSitePair> sitePair) {
            this.sitePair = sitePair;
            return this;
        }
        public java.util.List<DescribeSitePairsResponseBodySitePairsSitePair> getSitePair() {
            return this.sitePair;
        }

    }

}
