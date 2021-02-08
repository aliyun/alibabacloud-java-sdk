// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsCacheDomainsResponseBody extends TeaModel {
    @NameInMap("Domains")
    public java.util.List<DescribeDnsCacheDomainsResponseBodyDomains> domains;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Long pageNumber;

    public static DescribeDnsCacheDomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsCacheDomainsResponseBody self = new DescribeDnsCacheDomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDnsCacheDomainsResponseBody setDomains(java.util.List<DescribeDnsCacheDomainsResponseBodyDomains> domains) {
        this.domains = domains;
        return this;
    }
    public java.util.List<DescribeDnsCacheDomainsResponseBodyDomains> getDomains() {
        return this.domains;
    }

    public DescribeDnsCacheDomainsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeDnsCacheDomainsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeDnsCacheDomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDnsCacheDomainsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public static class DescribeDnsCacheDomainsResponseBodyDomainsSourceDnsServers extends TeaModel {
        @NameInMap("Host")
        public String host;

        @NameInMap("Port")
        public String port;

        public static DescribeDnsCacheDomainsResponseBodyDomainsSourceDnsServers build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsCacheDomainsResponseBodyDomainsSourceDnsServers self = new DescribeDnsCacheDomainsResponseBodyDomainsSourceDnsServers();
            return TeaModel.build(map, self);
        }

        public DescribeDnsCacheDomainsResponseBodyDomainsSourceDnsServers setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public DescribeDnsCacheDomainsResponseBodyDomainsSourceDnsServers setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

    public static class DescribeDnsCacheDomainsResponseBodyDomains extends TeaModel {
        @NameInMap("SourceProtocol")
        public String sourceProtocol;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("SourceEdns")
        public String sourceEdns;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("DomainId")
        public String domainId;

        @NameInMap("UpdateTimestamp")
        public Long updateTimestamp;

        @NameInMap("ExpireTimestamp")
        public Long expireTimestamp;

        @NameInMap("CacheTtlMax")
        public Integer cacheTtlMax;

        @NameInMap("CacheTtlMin")
        public Integer cacheTtlMin;

        @NameInMap("VersionCode")
        public String versionCode;

        @NameInMap("SourceDnsServers")
        public java.util.List<DescribeDnsCacheDomainsResponseBodyDomainsSourceDnsServers> sourceDnsServers;

        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        public static DescribeDnsCacheDomainsResponseBodyDomains build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsCacheDomainsResponseBodyDomains self = new DescribeDnsCacheDomainsResponseBodyDomains();
            return TeaModel.build(map, self);
        }

        public DescribeDnsCacheDomainsResponseBodyDomains setSourceProtocol(String sourceProtocol) {
            this.sourceProtocol = sourceProtocol;
            return this;
        }
        public String getSourceProtocol() {
            return this.sourceProtocol;
        }

        public DescribeDnsCacheDomainsResponseBodyDomains setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeDnsCacheDomainsResponseBodyDomains setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeDnsCacheDomainsResponseBodyDomains setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDnsCacheDomainsResponseBodyDomains setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDnsCacheDomainsResponseBodyDomains setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeDnsCacheDomainsResponseBodyDomains setSourceEdns(String sourceEdns) {
            this.sourceEdns = sourceEdns;
            return this;
        }
        public String getSourceEdns() {
            return this.sourceEdns;
        }

        public DescribeDnsCacheDomainsResponseBodyDomains setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeDnsCacheDomainsResponseBodyDomains setDomainId(String domainId) {
            this.domainId = domainId;
            return this;
        }
        public String getDomainId() {
            return this.domainId;
        }

        public DescribeDnsCacheDomainsResponseBodyDomains setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public DescribeDnsCacheDomainsResponseBodyDomains setExpireTimestamp(Long expireTimestamp) {
            this.expireTimestamp = expireTimestamp;
            return this;
        }
        public Long getExpireTimestamp() {
            return this.expireTimestamp;
        }

        public DescribeDnsCacheDomainsResponseBodyDomains setCacheTtlMax(Integer cacheTtlMax) {
            this.cacheTtlMax = cacheTtlMax;
            return this;
        }
        public Integer getCacheTtlMax() {
            return this.cacheTtlMax;
        }

        public DescribeDnsCacheDomainsResponseBodyDomains setCacheTtlMin(Integer cacheTtlMin) {
            this.cacheTtlMin = cacheTtlMin;
            return this;
        }
        public Integer getCacheTtlMin() {
            return this.cacheTtlMin;
        }

        public DescribeDnsCacheDomainsResponseBodyDomains setVersionCode(String versionCode) {
            this.versionCode = versionCode;
            return this;
        }
        public String getVersionCode() {
            return this.versionCode;
        }

        public DescribeDnsCacheDomainsResponseBodyDomains setSourceDnsServers(java.util.List<DescribeDnsCacheDomainsResponseBodyDomainsSourceDnsServers> sourceDnsServers) {
            this.sourceDnsServers = sourceDnsServers;
            return this;
        }
        public java.util.List<DescribeDnsCacheDomainsResponseBodyDomainsSourceDnsServers> getSourceDnsServers() {
            return this.sourceDnsServers;
        }

        public DescribeDnsCacheDomainsResponseBodyDomains setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

    }

}
