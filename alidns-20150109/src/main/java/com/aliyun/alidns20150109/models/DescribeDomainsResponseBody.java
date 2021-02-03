// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainsResponseBody extends TeaModel {
    @NameInMap("Domains")
    public DescribeDomainsResponseBodyDomains domains;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Long pageNumber;

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

    public DescribeDomainsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
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

    public DescribeDomainsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
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

    public static class DescribeDomainsResponseBodyDomainsDomain extends TeaModel {
        @NameInMap("Remark")
        public String remark;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("RecordCount")
        public Long recordCount;

        @NameInMap("Tags")
        public DescribeDomainsResponseBodyDomainsDomainTags tags;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("DomainId")
        public String domainId;

        @NameInMap("AliDomain")
        public Boolean aliDomain;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("InstanceEndTime")
        public String instanceEndTime;

        @NameInMap("InstanceExpired")
        public Boolean instanceExpired;

        @NameInMap("VersionName")
        public String versionName;

        @NameInMap("DnsServers")
        public DescribeDomainsResponseBodyDomainsDomainDnsServers dnsServers;

        @NameInMap("VersionCode")
        public String versionCode;

        @NameInMap("PunyCode")
        public String punyCode;

        @NameInMap("RegistrantEmail")
        public String registrantEmail;

        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        @NameInMap("Starmark")
        public Boolean starmark;

        public static DescribeDomainsResponseBodyDomainsDomain build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainsResponseBodyDomainsDomain self = new DescribeDomainsResponseBodyDomainsDomain();
            return TeaModel.build(map, self);
        }

        public DescribeDomainsResponseBodyDomainsDomain setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeDomainsResponseBodyDomainsDomain setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDomainsResponseBodyDomainsDomain setRecordCount(Long recordCount) {
            this.recordCount = recordCount;
            return this;
        }
        public Long getRecordCount() {
            return this.recordCount;
        }

        public DescribeDomainsResponseBodyDomainsDomain setTags(DescribeDomainsResponseBodyDomainsDomainTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeDomainsResponseBodyDomainsDomainTags getTags() {
            return this.tags;
        }

        public DescribeDomainsResponseBodyDomainsDomain setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeDomainsResponseBodyDomainsDomain setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeDomainsResponseBodyDomainsDomain setDomainId(String domainId) {
            this.domainId = domainId;
            return this;
        }
        public String getDomainId() {
            return this.domainId;
        }

        public DescribeDomainsResponseBodyDomainsDomain setAliDomain(Boolean aliDomain) {
            this.aliDomain = aliDomain;
            return this;
        }
        public Boolean getAliDomain() {
            return this.aliDomain;
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

        public DescribeDomainsResponseBodyDomainsDomain setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
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

        public DescribeDomainsResponseBodyDomainsDomain setVersionName(String versionName) {
            this.versionName = versionName;
            return this;
        }
        public String getVersionName() {
            return this.versionName;
        }

        public DescribeDomainsResponseBodyDomainsDomain setDnsServers(DescribeDomainsResponseBodyDomainsDomainDnsServers dnsServers) {
            this.dnsServers = dnsServers;
            return this;
        }
        public DescribeDomainsResponseBodyDomainsDomainDnsServers getDnsServers() {
            return this.dnsServers;
        }

        public DescribeDomainsResponseBodyDomainsDomain setVersionCode(String versionCode) {
            this.versionCode = versionCode;
            return this;
        }
        public String getVersionCode() {
            return this.versionCode;
        }

        public DescribeDomainsResponseBodyDomainsDomain setPunyCode(String punyCode) {
            this.punyCode = punyCode;
            return this;
        }
        public String getPunyCode() {
            return this.punyCode;
        }

        public DescribeDomainsResponseBodyDomainsDomain setRegistrantEmail(String registrantEmail) {
            this.registrantEmail = registrantEmail;
            return this;
        }
        public String getRegistrantEmail() {
            return this.registrantEmail;
        }

        public DescribeDomainsResponseBodyDomainsDomain setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DescribeDomainsResponseBodyDomainsDomain setStarmark(Boolean starmark) {
            this.starmark = starmark;
            return this;
        }
        public Boolean getStarmark() {
            return this.starmark;
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
