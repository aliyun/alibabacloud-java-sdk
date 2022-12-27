// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeUserDomainsRequest extends TeaModel {
    // The type of workload accelerated by Alibaba Cloud CDN. Separate types with commas (,). Valid values:
    // 
    // *   **web**: images and small files
    // *   **download**: large files
    // *   **video**: on-demand video and audio streaming
    // 
    // If you do not set this parameter, all service types are queried.
    @NameInMap("CdnType")
    public String cdnType;

    // The end of the time range to query. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
    // 
    // >  The end time must be later than the start time.
    @NameInMap("ChangeEndTime")
    public String changeEndTime;

    // The beginning of the time range to query. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
    @NameInMap("ChangeStartTime")
    public String changeStartTime;

    // Specifies whether to display domain names that are under review, failed the review, or failed to be configured. Valid values:
    // 
    // *   **true**: yes
    // *   **false**: no
    @NameInMap("CheckDomainShow")
    public Boolean checkDomainShow;

    // The accelerated region. By default, all accelerated regions are queried. Valid values:
    // 
    // *   **domestic**: Chinese mainland
    // *   **global**
    // *   **overseas**: global (excluding the Chinese mainland)
    @NameInMap("Coverage")
    public String coverage;

    // The accelerated domain names. If you do not set this parameter, configurations of all domain names that match the conditions are returned.
    @NameInMap("DomainName")
    public String domainName;

    // The search mode. Valid values:
    // 
    // *   **fuzzy_match**: fuzzy match
    // *   **pre_match**: prefix match
    // *   **suf_match**: suffix match
    // *   **full_match** (default): exact match
    // 
    // >  If you specify the domain names to query but do not set the DomainSearchType parameter, the exact match mode is used.
    @NameInMap("DomainSearchType")
    public String domainSearchType;

    // The status of the domain name. You can filter domain names by status. Valid values:
    // 
    // *   **online**: enabled
    // *   **offline**: disabled
    // *   **configuring**: being configured
    // *   **configure_failed**: failed to be configured
    // *   **checking**: under review
    // *   **check_failed**: failed the review
    // *   **stopping**: being disabled
    // *   **deleting**: deleting
    // 
    // If you do not set this parameter, all states are queried.
    @NameInMap("DomainStatus")
    public String domainStatus;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The number of the page to return. Valid values: **1** to **100000**.
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // The number of entries to return on each page. Valid values: **1 to 50**. Default value: **20**. Maximum value: **50**.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The ID of the resource group. By default, all IDs are queried.
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("SecurityToken")
    public String securityToken;

    // The information about the origin server.
    @NameInMap("Source")
    public String source;

    // The tags.
    @NameInMap("Tag")
    public java.util.List<DescribeUserDomainsRequestTag> tag;

    public static DescribeUserDomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserDomainsRequest self = new DescribeUserDomainsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserDomainsRequest setCdnType(String cdnType) {
        this.cdnType = cdnType;
        return this;
    }
    public String getCdnType() {
        return this.cdnType;
    }

    public DescribeUserDomainsRequest setChangeEndTime(String changeEndTime) {
        this.changeEndTime = changeEndTime;
        return this;
    }
    public String getChangeEndTime() {
        return this.changeEndTime;
    }

    public DescribeUserDomainsRequest setChangeStartTime(String changeStartTime) {
        this.changeStartTime = changeStartTime;
        return this;
    }
    public String getChangeStartTime() {
        return this.changeStartTime;
    }

    public DescribeUserDomainsRequest setCheckDomainShow(Boolean checkDomainShow) {
        this.checkDomainShow = checkDomainShow;
        return this;
    }
    public Boolean getCheckDomainShow() {
        return this.checkDomainShow;
    }

    public DescribeUserDomainsRequest setCoverage(String coverage) {
        this.coverage = coverage;
        return this;
    }
    public String getCoverage() {
        return this.coverage;
    }

    public DescribeUserDomainsRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeUserDomainsRequest setDomainSearchType(String domainSearchType) {
        this.domainSearchType = domainSearchType;
        return this;
    }
    public String getDomainSearchType() {
        return this.domainSearchType;
    }

    public DescribeUserDomainsRequest setDomainStatus(String domainStatus) {
        this.domainStatus = domainStatus;
        return this;
    }
    public String getDomainStatus() {
        return this.domainStatus;
    }

    public DescribeUserDomainsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeUserDomainsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeUserDomainsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeUserDomainsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeUserDomainsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeUserDomainsRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public DescribeUserDomainsRequest setTag(java.util.List<DescribeUserDomainsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeUserDomainsRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeUserDomainsRequestTag extends TeaModel {
        // The key of the tag. Valid values of N: **1** to **20**.
        // 
        // By default, all tag keys are queried.
        @NameInMap("Key")
        public String key;

        // The value of the tag. Valid values of N: **1** to **20**.
        // 
        // By default, all tag values are queried.
        @NameInMap("Value")
        public String value;

        public static DescribeUserDomainsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserDomainsRequestTag self = new DescribeUserDomainsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeUserDomainsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeUserDomainsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
