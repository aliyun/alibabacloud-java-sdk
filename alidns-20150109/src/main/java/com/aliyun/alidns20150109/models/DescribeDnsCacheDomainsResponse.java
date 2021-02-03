// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsCacheDomainsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Long pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Long pageSize;

    @NameInMap("Domains")
    @Validation(required = true)
    public java.util.List<DescribeDnsCacheDomainsResponseDomains> domains;

    public static DescribeDnsCacheDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsCacheDomainsResponse self = new DescribeDnsCacheDomainsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDnsCacheDomainsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDnsCacheDomainsResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeDnsCacheDomainsResponse setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDnsCacheDomainsResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeDnsCacheDomainsResponse setDomains(java.util.List<DescribeDnsCacheDomainsResponseDomains> domains) {
        this.domains = domains;
        return this;
    }
    public java.util.List<DescribeDnsCacheDomainsResponseDomains> getDomains() {
        return this.domains;
    }

    public static class DescribeDnsCacheDomainsResponseDomainsSourceDnsServers extends TeaModel {
        @NameInMap("Host")
        @Validation(required = true)
        public String host;

        @NameInMap("Port")
        @Validation(required = true)
        public String port;

        public static DescribeDnsCacheDomainsResponseDomainsSourceDnsServers build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsCacheDomainsResponseDomainsSourceDnsServers self = new DescribeDnsCacheDomainsResponseDomainsSourceDnsServers();
            return TeaModel.build(map, self);
        }

        public DescribeDnsCacheDomainsResponseDomainsSourceDnsServers setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public DescribeDnsCacheDomainsResponseDomainsSourceDnsServers setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

    public static class DescribeDnsCacheDomainsResponseDomains extends TeaModel {
        @NameInMap("DomainId")
        @Validation(required = true)
        public String domainId;

        @NameInMap("DomainName")
        @Validation(required = true)
        public String domainName;

        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("VersionCode")
        @Validation(required = true)
        public String versionCode;

        @NameInMap("Remark")
        @Validation(required = true)
        public String remark;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public String updateTime;

        @NameInMap("UpdateTimestamp")
        @Validation(required = true)
        public Long updateTimestamp;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("CreateTimestamp")
        @Validation(required = true)
        public Long createTimestamp;

        @NameInMap("CacheTtlMin")
        @Validation(required = true)
        public Integer cacheTtlMin;

        @NameInMap("CacheTtlMax")
        @Validation(required = true)
        public Integer cacheTtlMax;

        @NameInMap("SourceProtocol")
        @Validation(required = true)
        public String sourceProtocol;

        @NameInMap("SourceEdns")
        @Validation(required = true)
        public String sourceEdns;

        @NameInMap("ExpireTime")
        @Validation(required = true)
        public String expireTime;

        @NameInMap("ExpireTimestamp")
        @Validation(required = true)
        public Long expireTimestamp;

        @NameInMap("SourceDnsServers")
        @Validation(required = true)
        public java.util.List<DescribeDnsCacheDomainsResponseDomainsSourceDnsServers> sourceDnsServers;

        public static DescribeDnsCacheDomainsResponseDomains build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsCacheDomainsResponseDomains self = new DescribeDnsCacheDomainsResponseDomains();
            return TeaModel.build(map, self);
        }

        public DescribeDnsCacheDomainsResponseDomains setDomainId(String domainId) {
            this.domainId = domainId;
            return this;
        }
        public String getDomainId() {
            return this.domainId;
        }

        public DescribeDnsCacheDomainsResponseDomains setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeDnsCacheDomainsResponseDomains setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeDnsCacheDomainsResponseDomains setVersionCode(String versionCode) {
            this.versionCode = versionCode;
            return this;
        }
        public String getVersionCode() {
            return this.versionCode;
        }

        public DescribeDnsCacheDomainsResponseDomains setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeDnsCacheDomainsResponseDomains setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeDnsCacheDomainsResponseDomains setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public DescribeDnsCacheDomainsResponseDomains setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDnsCacheDomainsResponseDomains setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DescribeDnsCacheDomainsResponseDomains setCacheTtlMin(Integer cacheTtlMin) {
            this.cacheTtlMin = cacheTtlMin;
            return this;
        }
        public Integer getCacheTtlMin() {
            return this.cacheTtlMin;
        }

        public DescribeDnsCacheDomainsResponseDomains setCacheTtlMax(Integer cacheTtlMax) {
            this.cacheTtlMax = cacheTtlMax;
            return this;
        }
        public Integer getCacheTtlMax() {
            return this.cacheTtlMax;
        }

        public DescribeDnsCacheDomainsResponseDomains setSourceProtocol(String sourceProtocol) {
            this.sourceProtocol = sourceProtocol;
            return this;
        }
        public String getSourceProtocol() {
            return this.sourceProtocol;
        }

        public DescribeDnsCacheDomainsResponseDomains setSourceEdns(String sourceEdns) {
            this.sourceEdns = sourceEdns;
            return this;
        }
        public String getSourceEdns() {
            return this.sourceEdns;
        }

        public DescribeDnsCacheDomainsResponseDomains setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDnsCacheDomainsResponseDomains setExpireTimestamp(Long expireTimestamp) {
            this.expireTimestamp = expireTimestamp;
            return this;
        }
        public Long getExpireTimestamp() {
            return this.expireTimestamp;
        }

        public DescribeDnsCacheDomainsResponseDomains setSourceDnsServers(java.util.List<DescribeDnsCacheDomainsResponseDomainsSourceDnsServers> sourceDnsServers) {
            this.sourceDnsServers = sourceDnsServers;
            return this;
        }
        public java.util.List<DescribeDnsCacheDomainsResponseDomainsSourceDnsServers> getSourceDnsServers() {
            return this.sourceDnsServers;
        }

    }

}
