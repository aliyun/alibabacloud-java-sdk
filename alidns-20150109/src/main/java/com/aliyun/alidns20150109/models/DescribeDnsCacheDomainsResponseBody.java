// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsCacheDomainsResponseBody extends TeaModel {
    /**
     * <p>The domain names.</p>
     */
    @NameInMap("Domains")
    public java.util.List<DescribeDnsCacheDomainsResponseBodyDomains> domains;

    /**
     * <p>The page number. Pages start from page **1**. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: 20.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

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

    public DescribeDnsCacheDomainsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
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

    public DescribeDnsCacheDomainsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDnsCacheDomainsResponseBodyDomainsSourceDnsServers extends TeaModel {
        /**
         * <p>The domain name or IP address of the origin DNS server.</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The port of the origin DNS server.</p>
         */
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
        /**
         * <p>The maximum time-to-live (TTL) period of the cached data retrieved from the origin DNS server. Unit: seconds. Valid values: 30 to 86400.</p>
         */
        @NameInMap("CacheTtlMax")
        public Integer cacheTtlMax;

        /**
         * <p>The minimum TTL period of the cached data retrieved from the origin DNS server. Unit: seconds. Valid values: 30 to 86400.</p>
         */
        @NameInMap("CacheTtlMin")
        public Integer cacheTtlMin;

        /**
         * <p>The time when the domain name was added. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time when the domain name was added. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        /**
         * <p>The ID of the cache-accelerated domain name.</p>
         */
        @NameInMap("DomainId")
        public String domainId;

        /**
         * <p>The cache-accelerated domain name.</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The time when the instance expires. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The time when the instance expires. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("ExpireTimestamp")
        public Long expireTimestamp;

        /**
         * <p>The instance ID of the cache-accelerated domain name.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The description of the domain name.</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The origin DNS servers.</p>
         */
        @NameInMap("SourceDnsServers")
        public java.util.List<DescribeDnsCacheDomainsResponseBodyDomainsSourceDnsServers> sourceDnsServers;

        /**
         * <p>Specifies whether the origin Domain Name System (DNS) server supports Extension Mechanisms for DNS (EDNS). Valid values: NOT_SUPPORT and SUPPORT.</p>
         */
        @NameInMap("SourceEdns")
        public String sourceEdns;

        /**
         * <p>The origin protocol policy. Valid values: TCP and UDP. Default value: UDP.</p>
         */
        @NameInMap("SourceProtocol")
        public String sourceProtocol;

        /**
         * <p>The time when the configurations of the domain name were updated. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The time when the configurations of the domain name were updated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("UpdateTimestamp")
        public Long updateTimestamp;

        /**
         * <p>The edition code of Alibaba Cloud DNS.</p>
         */
        @NameInMap("VersionCode")
        public String versionCode;

        public static DescribeDnsCacheDomainsResponseBodyDomains build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsCacheDomainsResponseBodyDomains self = new DescribeDnsCacheDomainsResponseBodyDomains();
            return TeaModel.build(map, self);
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

        public DescribeDnsCacheDomainsResponseBodyDomains setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDnsCacheDomainsResponseBodyDomains setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DescribeDnsCacheDomainsResponseBodyDomains setDomainId(String domainId) {
            this.domainId = domainId;
            return this;
        }
        public String getDomainId() {
            return this.domainId;
        }

        public DescribeDnsCacheDomainsResponseBodyDomains setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeDnsCacheDomainsResponseBodyDomains setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDnsCacheDomainsResponseBodyDomains setExpireTimestamp(Long expireTimestamp) {
            this.expireTimestamp = expireTimestamp;
            return this;
        }
        public Long getExpireTimestamp() {
            return this.expireTimestamp;
        }

        public DescribeDnsCacheDomainsResponseBodyDomains setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeDnsCacheDomainsResponseBodyDomains setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeDnsCacheDomainsResponseBodyDomains setSourceDnsServers(java.util.List<DescribeDnsCacheDomainsResponseBodyDomainsSourceDnsServers> sourceDnsServers) {
            this.sourceDnsServers = sourceDnsServers;
            return this;
        }
        public java.util.List<DescribeDnsCacheDomainsResponseBodyDomainsSourceDnsServers> getSourceDnsServers() {
            return this.sourceDnsServers;
        }

        public DescribeDnsCacheDomainsResponseBodyDomains setSourceEdns(String sourceEdns) {
            this.sourceEdns = sourceEdns;
            return this;
        }
        public String getSourceEdns() {
            return this.sourceEdns;
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

        public DescribeDnsCacheDomainsResponseBodyDomains setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public DescribeDnsCacheDomainsResponseBodyDomains setVersionCode(String versionCode) {
            this.versionCode = versionCode;
            return this;
        }
        public String getVersionCode() {
            return this.versionCode;
        }

    }

}
