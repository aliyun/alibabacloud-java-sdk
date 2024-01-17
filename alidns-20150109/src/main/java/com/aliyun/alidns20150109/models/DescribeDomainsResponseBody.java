// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainsResponseBody extends TeaModel {
    /**
     * <p>The list of domain names queried by this operation.</p>
     */
    @NameInMap("Domains")
    public DescribeDomainsResponseBodyDomains domains;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of domain names.</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeDomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainsResponseBody self = new DescribeDomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainsResponseBody setDomains(DescribeDomainsResponseBodyDomains domains) {
        this.domains = domains;
        return this;
    }
    public DescribeDomainsResponseBodyDomains getDomains() {
        return this.domains;
    }

    public DescribeDomainsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDomainsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeDomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDomainsResponseBodyDomainsDomainDnsServers extends TeaModel {
        @NameInMap("DnsServer")
        public java.util.List<String> dnsServer;

        public static DescribeDomainsResponseBodyDomainsDomainDnsServers build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainsResponseBodyDomainsDomainDnsServers self = new DescribeDomainsResponseBodyDomainsDomainDnsServers();
            return TeaModel.build(map, self);
        }

        public DescribeDomainsResponseBodyDomainsDomainDnsServers setDnsServer(java.util.List<String> dnsServer) {
            this.dnsServer = dnsServer;
            return this;
        }
        public java.util.List<String> getDnsServer() {
            return this.dnsServer;
        }

    }

    public static class DescribeDomainsResponseBodyDomainsDomainTagsTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeDomainsResponseBodyDomainsDomainTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainsResponseBodyDomainsDomainTagsTag self = new DescribeDomainsResponseBodyDomainsDomainTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeDomainsResponseBodyDomainsDomainTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDomainsResponseBodyDomainsDomainTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDomainsResponseBodyDomainsDomainTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeDomainsResponseBodyDomainsDomainTagsTag> tag;

        public static DescribeDomainsResponseBodyDomainsDomainTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainsResponseBodyDomainsDomainTags self = new DescribeDomainsResponseBodyDomainsDomainTags();
            return TeaModel.build(map, self);
        }

        public DescribeDomainsResponseBodyDomainsDomainTags setTag(java.util.List<DescribeDomainsResponseBodyDomainsDomainTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeDomainsResponseBodyDomainsDomainTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeDomainsResponseBodyDomainsDomain extends TeaModel {
        /**
         * <p>Indicates whether the domain name is an Alibaba Cloud HiChina domain name.</p>
         */
        @NameInMap("AliDomain")
        public Boolean aliDomain;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        /**
         * <p>The list of DNS servers of the domain name in the DNS system.</p>
         */
        @NameInMap("DnsServers")
        public DescribeDomainsResponseBodyDomainsDomainDnsServers dnsServers;

        /**
         * <p>The ID of the domain name.</p>
         */
        @NameInMap("DomainId")
        public String domainId;

        @NameInMap("DomainLoggingSwitchStatus")
        public String domainLoggingSwitchStatus;

        /**
         * <p>The domain name.</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The ID of the domain name group.</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the domain name group.</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The expiration time of the instance.</p>
         */
        @NameInMap("InstanceEndTime")
        public String instanceEndTime;

        /**
         * <p>Indicates whether the instance expired.</p>
         */
        @NameInMap("InstanceExpired")
        public Boolean instanceExpired;

        /**
         * <p>The ID of the Alibaba Cloud DNS instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The punycode is returned for Chinese domain names and is left blank for English domain names.</p>
         */
        @NameInMap("PunyCode")
        public String punyCode;

        /**
         * <p>The number of DNS records of the domain name.</p>
         */
        @NameInMap("RecordCount")
        public Long recordCount;

        /**
         * <p>The email address of the registrant.</p>
         */
        @NameInMap("RegistrantEmail")
        public String registrantEmail;

        /**
         * <p>The description.</p>
         */
        @NameInMap("Remark")
        public String remark;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>Indicates whether to query the starmark of the domain name.</p>
         */
        @NameInMap("Starmark")
        public Boolean starmark;

        @NameInMap("Tags")
        public DescribeDomainsResponseBodyDomainsDomainTags tags;

        /**
         * <p>The version code of the Alibaba Cloud DNS instance.</p>
         */
        @NameInMap("VersionCode")
        public String versionCode;

        /**
         * <p>The version name of the Alibaba Cloud DNS instance.</p>
         */
        @NameInMap("VersionName")
        public String versionName;

        public static DescribeDomainsResponseBodyDomainsDomain build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainsResponseBodyDomainsDomain self = new DescribeDomainsResponseBodyDomainsDomain();
            return TeaModel.build(map, self);
        }

        public DescribeDomainsResponseBodyDomainsDomain setAliDomain(Boolean aliDomain) {
            this.aliDomain = aliDomain;
            return this;
        }
        public Boolean getAliDomain() {
            return this.aliDomain;
        }

        public DescribeDomainsResponseBodyDomainsDomain setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDomainsResponseBodyDomainsDomain setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DescribeDomainsResponseBodyDomainsDomain setDnsServers(DescribeDomainsResponseBodyDomainsDomainDnsServers dnsServers) {
            this.dnsServers = dnsServers;
            return this;
        }
        public DescribeDomainsResponseBodyDomainsDomainDnsServers getDnsServers() {
            return this.dnsServers;
        }

        public DescribeDomainsResponseBodyDomainsDomain setDomainId(String domainId) {
            this.domainId = domainId;
            return this;
        }
        public String getDomainId() {
            return this.domainId;
        }

        public DescribeDomainsResponseBodyDomainsDomain setDomainLoggingSwitchStatus(String domainLoggingSwitchStatus) {
            this.domainLoggingSwitchStatus = domainLoggingSwitchStatus;
            return this;
        }
        public String getDomainLoggingSwitchStatus() {
            return this.domainLoggingSwitchStatus;
        }

        public DescribeDomainsResponseBodyDomainsDomain setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeDomainsResponseBodyDomainsDomain setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeDomainsResponseBodyDomainsDomain setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeDomainsResponseBodyDomainsDomain setInstanceEndTime(String instanceEndTime) {
            this.instanceEndTime = instanceEndTime;
            return this;
        }
        public String getInstanceEndTime() {
            return this.instanceEndTime;
        }

        public DescribeDomainsResponseBodyDomainsDomain setInstanceExpired(Boolean instanceExpired) {
            this.instanceExpired = instanceExpired;
            return this;
        }
        public Boolean getInstanceExpired() {
            return this.instanceExpired;
        }

        public DescribeDomainsResponseBodyDomainsDomain setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeDomainsResponseBodyDomainsDomain setPunyCode(String punyCode) {
            this.punyCode = punyCode;
            return this;
        }
        public String getPunyCode() {
            return this.punyCode;
        }

        public DescribeDomainsResponseBodyDomainsDomain setRecordCount(Long recordCount) {
            this.recordCount = recordCount;
            return this;
        }
        public Long getRecordCount() {
            return this.recordCount;
        }

        public DescribeDomainsResponseBodyDomainsDomain setRegistrantEmail(String registrantEmail) {
            this.registrantEmail = registrantEmail;
            return this;
        }
        public String getRegistrantEmail() {
            return this.registrantEmail;
        }

        public DescribeDomainsResponseBodyDomainsDomain setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeDomainsResponseBodyDomainsDomain setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDomainsResponseBodyDomainsDomain setStarmark(Boolean starmark) {
            this.starmark = starmark;
            return this;
        }
        public Boolean getStarmark() {
            return this.starmark;
        }

        public DescribeDomainsResponseBodyDomainsDomain setTags(DescribeDomainsResponseBodyDomainsDomainTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeDomainsResponseBodyDomainsDomainTags getTags() {
            return this.tags;
        }

        public DescribeDomainsResponseBodyDomainsDomain setVersionCode(String versionCode) {
            this.versionCode = versionCode;
            return this;
        }
        public String getVersionCode() {
            return this.versionCode;
        }

        public DescribeDomainsResponseBodyDomainsDomain setVersionName(String versionName) {
            this.versionName = versionName;
            return this;
        }
        public String getVersionName() {
            return this.versionName;
        }

    }

    public static class DescribeDomainsResponseBodyDomains extends TeaModel {
        @NameInMap("Domain")
        public java.util.List<DescribeDomainsResponseBodyDomainsDomain> domain;

        public static DescribeDomainsResponseBodyDomains build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainsResponseBodyDomains self = new DescribeDomainsResponseBodyDomains();
            return TeaModel.build(map, self);
        }

        public DescribeDomainsResponseBodyDomains setDomain(java.util.List<DescribeDomainsResponseBodyDomainsDomain> domain) {
            this.domain = domain;
            return this;
        }
        public java.util.List<DescribeDomainsResponseBodyDomainsDomain> getDomain() {
            return this.domain;
        }

    }

}
