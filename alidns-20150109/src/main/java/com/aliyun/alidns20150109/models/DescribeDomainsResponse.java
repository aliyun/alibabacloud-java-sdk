// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainsResponse extends TeaModel {
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
    public DescribeDomainsResponseDomains domains;

    public static DescribeDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainsResponse self = new DescribeDomainsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainsResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeDomainsResponse setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDomainsResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeDomainsResponse setDomains(DescribeDomainsResponseDomains domains) {
        this.domains = domains;
        return this;
    }
    public DescribeDomainsResponseDomains getDomains() {
        return this.domains;
    }

    public static class DescribeDomainsResponseDomainsDomainTagsTag extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static DescribeDomainsResponseDomainsDomainTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainsResponseDomainsDomainTagsTag self = new DescribeDomainsResponseDomainsDomainTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeDomainsResponseDomainsDomainTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDomainsResponseDomainsDomainTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDomainsResponseDomainsDomainTags extends TeaModel {
        @NameInMap("Tag")
        @Validation(required = true)
        public java.util.List<DescribeDomainsResponseDomainsDomainTagsTag> tag;

        public static DescribeDomainsResponseDomainsDomainTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainsResponseDomainsDomainTags self = new DescribeDomainsResponseDomainsDomainTags();
            return TeaModel.build(map, self);
        }

        public DescribeDomainsResponseDomainsDomainTags setTag(java.util.List<DescribeDomainsResponseDomainsDomainTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeDomainsResponseDomainsDomainTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeDomainsResponseDomainsDomainDnsServers extends TeaModel {
        // DnsServer
        @NameInMap("DnsServer")
        @Validation(required = true)
        public java.util.List<String> dnsServer;

        public static DescribeDomainsResponseDomainsDomainDnsServers build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainsResponseDomainsDomainDnsServers self = new DescribeDomainsResponseDomainsDomainDnsServers();
            return TeaModel.build(map, self);
        }

        public DescribeDomainsResponseDomainsDomainDnsServers setDnsServer(java.util.List<String> dnsServer) {
            this.dnsServer = dnsServer;
            return this;
        }
        public java.util.List<String> getDnsServer() {
            return this.dnsServer;
        }

    }

    public static class DescribeDomainsResponseDomainsDomain extends TeaModel {
        @NameInMap("DomainId")
        @Validation(required = true)
        public String domainId;

        @NameInMap("DomainName")
        @Validation(required = true)
        public String domainName;

        @NameInMap("PunyCode")
        @Validation(required = true)
        public String punyCode;

        @NameInMap("AliDomain")
        @Validation(required = true)
        public Boolean aliDomain;

        @NameInMap("RecordCount")
        @Validation(required = true)
        public Long recordCount;

        @NameInMap("RegistrantEmail")
        @Validation(required = true)
        public String registrantEmail;

        @NameInMap("Remark")
        @Validation(required = true)
        public String remark;

        @NameInMap("GroupId")
        @Validation(required = true)
        public String groupId;

        @NameInMap("GroupName")
        @Validation(required = true)
        public String groupName;

        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("VersionCode")
        @Validation(required = true)
        public String versionCode;

        @NameInMap("VersionName")
        @Validation(required = true)
        public String versionName;

        @NameInMap("InstanceEndTime")
        @Validation(required = true)
        public String instanceEndTime;

        @NameInMap("InstanceExpired")
        @Validation(required = true)
        public Boolean instanceExpired;

        @NameInMap("Starmark")
        @Validation(required = true)
        public Boolean starmark;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("CreateTimestamp")
        @Validation(required = true)
        public Long createTimestamp;

        @NameInMap("ResourceGroupId")
        @Validation(required = true)
        public String resourceGroupId;

        @NameInMap("Tags")
        @Validation(required = true)
        public DescribeDomainsResponseDomainsDomainTags tags;

        @NameInMap("DnsServers")
        @Validation(required = true)
        public DescribeDomainsResponseDomainsDomainDnsServers dnsServers;

        public static DescribeDomainsResponseDomainsDomain build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainsResponseDomainsDomain self = new DescribeDomainsResponseDomainsDomain();
            return TeaModel.build(map, self);
        }

        public DescribeDomainsResponseDomainsDomain setDomainId(String domainId) {
            this.domainId = domainId;
            return this;
        }
        public String getDomainId() {
            return this.domainId;
        }

        public DescribeDomainsResponseDomainsDomain setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeDomainsResponseDomainsDomain setPunyCode(String punyCode) {
            this.punyCode = punyCode;
            return this;
        }
        public String getPunyCode() {
            return this.punyCode;
        }

        public DescribeDomainsResponseDomainsDomain setAliDomain(Boolean aliDomain) {
            this.aliDomain = aliDomain;
            return this;
        }
        public Boolean getAliDomain() {
            return this.aliDomain;
        }

        public DescribeDomainsResponseDomainsDomain setRecordCount(Long recordCount) {
            this.recordCount = recordCount;
            return this;
        }
        public Long getRecordCount() {
            return this.recordCount;
        }

        public DescribeDomainsResponseDomainsDomain setRegistrantEmail(String registrantEmail) {
            this.registrantEmail = registrantEmail;
            return this;
        }
        public String getRegistrantEmail() {
            return this.registrantEmail;
        }

        public DescribeDomainsResponseDomainsDomain setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeDomainsResponseDomainsDomain setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeDomainsResponseDomainsDomain setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeDomainsResponseDomainsDomain setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeDomainsResponseDomainsDomain setVersionCode(String versionCode) {
            this.versionCode = versionCode;
            return this;
        }
        public String getVersionCode() {
            return this.versionCode;
        }

        public DescribeDomainsResponseDomainsDomain setVersionName(String versionName) {
            this.versionName = versionName;
            return this;
        }
        public String getVersionName() {
            return this.versionName;
        }

        public DescribeDomainsResponseDomainsDomain setInstanceEndTime(String instanceEndTime) {
            this.instanceEndTime = instanceEndTime;
            return this;
        }
        public String getInstanceEndTime() {
            return this.instanceEndTime;
        }

        public DescribeDomainsResponseDomainsDomain setInstanceExpired(Boolean instanceExpired) {
            this.instanceExpired = instanceExpired;
            return this;
        }
        public Boolean getInstanceExpired() {
            return this.instanceExpired;
        }

        public DescribeDomainsResponseDomainsDomain setStarmark(Boolean starmark) {
            this.starmark = starmark;
            return this;
        }
        public Boolean getStarmark() {
            return this.starmark;
        }

        public DescribeDomainsResponseDomainsDomain setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDomainsResponseDomainsDomain setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DescribeDomainsResponseDomainsDomain setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDomainsResponseDomainsDomain setTags(DescribeDomainsResponseDomainsDomainTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeDomainsResponseDomainsDomainTags getTags() {
            return this.tags;
        }

        public DescribeDomainsResponseDomainsDomain setDnsServers(DescribeDomainsResponseDomainsDomainDnsServers dnsServers) {
            this.dnsServers = dnsServers;
            return this;
        }
        public DescribeDomainsResponseDomainsDomainDnsServers getDnsServers() {
            return this.dnsServers;
        }

    }

    public static class DescribeDomainsResponseDomains extends TeaModel {
        @NameInMap("Domain")
        @Validation(required = true)
        public java.util.List<DescribeDomainsResponseDomainsDomain> domain;

        public static DescribeDomainsResponseDomains build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainsResponseDomains self = new DescribeDomainsResponseDomains();
            return TeaModel.build(map, self);
        }

        public DescribeDomainsResponseDomains setDomain(java.util.List<DescribeDomainsResponseDomainsDomain> domain) {
            this.domain = domain;
            return this;
        }
        public java.util.List<DescribeDomainsResponseDomainsDomain> getDomain() {
            return this.domain;
        }

    }

}
