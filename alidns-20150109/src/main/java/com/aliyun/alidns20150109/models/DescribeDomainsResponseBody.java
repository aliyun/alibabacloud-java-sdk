// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainsResponseBody extends TeaModel {
    @NameInMap("Domains")
    public java.util.List<DescribeDomainsResponseBodyDomains> domains;

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

    public DescribeDomainsResponseBody setDomains(java.util.List<DescribeDomainsResponseBodyDomains> domains) {
        this.domains = domains;
        return this;
    }
    public java.util.List<DescribeDomainsResponseBodyDomains> getDomains() {
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

    public static class DescribeDomainsResponseBodyDomainsTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeDomainsResponseBodyDomainsTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainsResponseBodyDomainsTags self = new DescribeDomainsResponseBodyDomainsTags();
            return TeaModel.build(map, self);
        }

        public DescribeDomainsResponseBodyDomainsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDomainsResponseBodyDomainsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDomainsResponseBodyDomains extends TeaModel {
        @NameInMap("Remark")
        public String remark;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("RecordCount")
        public Long recordCount;

        @NameInMap("Tags")
        public java.util.List<DescribeDomainsResponseBodyDomainsTags> tags;

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
        public java.util.List<String> dnsServers;

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

        public static DescribeDomainsResponseBodyDomains build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainsResponseBodyDomains self = new DescribeDomainsResponseBodyDomains();
            return TeaModel.build(map, self);
        }

        public DescribeDomainsResponseBodyDomains setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeDomainsResponseBodyDomains setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDomainsResponseBodyDomains setRecordCount(Long recordCount) {
            this.recordCount = recordCount;
            return this;
        }
        public Long getRecordCount() {
            return this.recordCount;
        }

        public DescribeDomainsResponseBodyDomains setTags(java.util.List<DescribeDomainsResponseBodyDomainsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeDomainsResponseBodyDomainsTags> getTags() {
            return this.tags;
        }

        public DescribeDomainsResponseBodyDomains setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeDomainsResponseBodyDomains setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeDomainsResponseBodyDomains setDomainId(String domainId) {
            this.domainId = domainId;
            return this;
        }
        public String getDomainId() {
            return this.domainId;
        }

        public DescribeDomainsResponseBodyDomains setAliDomain(Boolean aliDomain) {
            this.aliDomain = aliDomain;
            return this;
        }
        public Boolean getAliDomain() {
            return this.aliDomain;
        }

        public DescribeDomainsResponseBodyDomains setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeDomainsResponseBodyDomains setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeDomainsResponseBodyDomains setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDomainsResponseBodyDomains setInstanceEndTime(String instanceEndTime) {
            this.instanceEndTime = instanceEndTime;
            return this;
        }
        public String getInstanceEndTime() {
            return this.instanceEndTime;
        }

        public DescribeDomainsResponseBodyDomains setInstanceExpired(Boolean instanceExpired) {
            this.instanceExpired = instanceExpired;
            return this;
        }
        public Boolean getInstanceExpired() {
            return this.instanceExpired;
        }

        public DescribeDomainsResponseBodyDomains setVersionName(String versionName) {
            this.versionName = versionName;
            return this;
        }
        public String getVersionName() {
            return this.versionName;
        }

        public DescribeDomainsResponseBodyDomains setDnsServers(java.util.List<String> dnsServers) {
            this.dnsServers = dnsServers;
            return this;
        }
        public java.util.List<String> getDnsServers() {
            return this.dnsServers;
        }

        public DescribeDomainsResponseBodyDomains setVersionCode(String versionCode) {
            this.versionCode = versionCode;
            return this;
        }
        public String getVersionCode() {
            return this.versionCode;
        }

        public DescribeDomainsResponseBodyDomains setPunyCode(String punyCode) {
            this.punyCode = punyCode;
            return this;
        }
        public String getPunyCode() {
            return this.punyCode;
        }

        public DescribeDomainsResponseBodyDomains setRegistrantEmail(String registrantEmail) {
            this.registrantEmail = registrantEmail;
            return this;
        }
        public String getRegistrantEmail() {
            return this.registrantEmail;
        }

        public DescribeDomainsResponseBodyDomains setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DescribeDomainsResponseBodyDomains setStarmark(Boolean starmark) {
            this.starmark = starmark;
            return this;
        }
        public Boolean getStarmark() {
            return this.starmark;
        }

    }

}
