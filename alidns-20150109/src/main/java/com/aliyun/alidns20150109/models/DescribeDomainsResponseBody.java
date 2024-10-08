// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainsResponseBody extends TeaModel {
    /**
     * <p>The domain names.</p>
     */
    @NameInMap("Domains")
    public DescribeDomainsResponseBodyDomains domains;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>68386699-8B9E-4D5B-BC4C-75A28F6C2A00</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of domain names.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
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
        /**
         * <p>The key of tag N added to the resource.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N added to the resource.</p>
         */
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
         * <p>Indicates whether the domain name was registered with Alibaba Cloud.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AliDomain")
        public Boolean aliDomain;

        /**
         * <p>The time when the domain name was added. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-01-30T05:25Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time when the domain name was added. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1660546144000</p>
         */
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        /**
         * <p>The names of the DNS servers configured for the domain name assigned by Alibaba Cloud DNS.</p>
         */
        @NameInMap("DnsServers")
        public DescribeDomainsResponseBodyDomainsDomainDnsServers dnsServers;

        /**
         * <p>The ID of the domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>00efd71a-770e-4255-b54e-6fe5659baffe</p>
         */
        @NameInMap("DomainId")
        public String domainId;

        /**
         * <p>Indicates whether the DNS traffic analysis feature is enabled for the domain name. Valid values:</p>
         * <ul>
         * <li>OPEN</li>
         * <li>CLOSE</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OPEN</p>
         */
        @NameInMap("DomainLoggingSwitchStatus")
        public String domainLoggingSwitchStatus;

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>abc.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The ID of the domain name group.</p>
         * 
         * <strong>example:</strong>
         * <p>2223</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the domain name group.</p>
         * 
         * <strong>example:</strong>
         * <p>mygroup</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The time when the Alibaba Cloud DNS instance expires. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-03-14T16:00Z</p>
         */
        @NameInMap("InstanceEndTime")
        public String instanceEndTime;

        /**
         * <p>Indicates whether the Alibaba Cloud DNS instance expires.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("InstanceExpired")
        public Boolean instanceExpired;

        /**
         * <p>The ID of the Alibaba Cloud DNS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-7bg</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The Punycode for the domain name. This parameter is returned only for Chinese domain names.</p>
         * 
         * <strong>example:</strong>
         * <p>abc.com</p>
         */
        @NameInMap("PunyCode")
        public String punyCode;

        /**
         * <p>The number of Domain Name System (DNS) records added for the domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("RecordCount")
        public Long recordCount;

        /**
         * <p>The email address of the registrant.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:test@example.com">test@example.com</a></p>
         */
        @NameInMap("RegistrantEmail")
        public String registrantEmail;

        /**
         * <p>The description of the domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>remark</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The ID of the resource group to which the domain name belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acf</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>Indicates whether the domain name was added to favorites.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Starmark")
        public Boolean starmark;

        /**
         * <p>The tags added to the resource.</p>
         */
        @NameInMap("Tags")
        public DescribeDomainsResponseBodyDomainsDomainTags tags;

        /**
         * <p>The edition code of Alibaba Cloud DNS.</p>
         * 
         * <strong>example:</strong>
         * <p>version_enterprise_basic</p>
         */
        @NameInMap("VersionCode")
        public String versionCode;

        /**
         * <p>The edition of Alibaba Cloud DNS.</p>
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
