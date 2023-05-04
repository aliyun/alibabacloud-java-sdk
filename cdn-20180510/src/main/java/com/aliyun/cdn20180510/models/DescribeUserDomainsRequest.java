// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeUserDomainsRequest extends TeaModel {
    /**
     * <p>The type of workload accelerated by Alibaba Cloud CDN. Separate types with commas (,). Valid values:</p>
     * <br>
     * <p>*   **web**: images and small files</p>
     * <p>*   **download**: large files</p>
     * <p>*   **video**: on-demand video and audio streaming</p>
     * <br>
     * <p>If you do not set this parameter, all service types are queried.</p>
     */
    @NameInMap("CdnType")
    public String cdnType;

    /**
     * <p>The end of the time range to query. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <br>
     * <p>> The end time must be later than the start time.</p>
     */
    @NameInMap("ChangeEndTime")
    public String changeEndTime;

    /**
     * <p>The beginning of the time range to query. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     */
    @NameInMap("ChangeStartTime")
    public String changeStartTime;

    /**
     * <p>Specifies whether to display domain names that are under review, failed the review, or failed to be configured. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("CheckDomainShow")
    public Boolean checkDomainShow;

    /**
     * <p>The acceleration region. By default, all acceleration regions are queried. Valid values:</p>
     * <br>
     * <p>*   **domestic**: Chinese mainland</p>
     * <p>*   **global**: global</p>
     * <p>*   **overseas**: outside the Chinese mainland</p>
     */
    @NameInMap("Coverage")
    public String coverage;

    /**
     * <p>The accelerated domain. If you do not set this parameter, all domain names that match the conditions are returned.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The search mode. Valid values:</p>
     * <br>
     * <p>*   **fuzzy_match**: fuzzy match</p>
     * <p>*   **pre_match**: prefix match</p>
     * <p>*   **suf_match**: suffix match</p>
     * <p>*   **full_match** (default): exact match</p>
     * <br>
     * <p>> If you specify the domain names to query but do not set the DomainSearchType parameter, the exact match mode is used.</p>
     */
    @NameInMap("DomainSearchType")
    public String domainSearchType;

    /**
     * <p>The status of the domain name. Valid values:</p>
     * <br>
     * <p>*   **online**</p>
     * <p>*   **offline**</p>
     * <p>*   **configuring**</p>
     * <p>*   **configure_failed**</p>
     * <p>*   **checking**</p>
     * <p>*   **check_failed**</p>
     * <p>*   **stopping**</p>
     * <p>*   **deleting**</p>
     * <br>
     * <p>If you do not set this parameter, domain names in all states are queried.</p>
     */
    @NameInMap("DomainStatus")
    public String domainStatus;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of the page to return. Valid values: **1** to **100000**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values: **1 to 50**. Default value: **20**. Maximum value: **50**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the resource group. By default, all IDs are queried.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The information about the origin server.</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The list of tags. Maximum number of elements in the list: 20</p>
     */
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
        /**
         * <p>The key of a tag.</p>
         * <br>
         * <p>By default, all tag keys are queried.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * <br>
         * <p>By default, all tag values are queried.</p>
         */
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
