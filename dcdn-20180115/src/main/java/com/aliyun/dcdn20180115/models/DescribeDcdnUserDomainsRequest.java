// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnUserDomainsRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC+0.</p>
     * <br>
     * <p>> The end time must be later than the start time.</p>
     */
    @NameInMap("ChangeEndTime")
    public String changeEndTime;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC+0.</p>
     */
    @NameInMap("ChangeStartTime")
    public String changeStartTime;

    /**
     * <p>Specifies whether to display domain names that are under review, failed the review, or failed to be configured. Valid values:</p>
     * <br>
     * <p>*   true: displays domain names.</p>
     * <p>*   false: does not display detailed information.</p>
     */
    @NameInMap("CheckDomainShow")
    public Boolean checkDomainShow;

    /**
     * <p>The acceleration region. By default, all acceleration regions are queried.</p>
     * <br>
     * <p>*   **domestic**: Chinese mainland</p>
     * <p>*   **overseas**: outside the Chinese mainland</p>
     * <p>*   **global**: global</p>
     */
    @NameInMap("Coverage")
    public String coverage;

    /**
     * <p>The accelerated domain names. If you do not set this parameter, configurations of all domain names that match the conditions are returned.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The search method. Default value: full_match. Valid values:</p>
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
     * <p>*   **online**: enabled</p>
     * <p>*   **offline**: disabled</p>
     * <p>*   **configuring**: configuring</p>
     * <p>*   **configure_failed**: configuration failed</p>
     * <p>*   **checking**: reviewing</p>
     * <p>*   **check_failed:** review failed</p>
     */
    @NameInMap("DomainStatus")
    public String domainStatus;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of returned pages. Valid values: **1** to **100000**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: **20**. Valid values: **1** to **500**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeDcdnUserDomainsRequestTag> tag;

    public static DescribeDcdnUserDomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnUserDomainsRequest self = new DescribeDcdnUserDomainsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnUserDomainsRequest setChangeEndTime(String changeEndTime) {
        this.changeEndTime = changeEndTime;
        return this;
    }
    public String getChangeEndTime() {
        return this.changeEndTime;
    }

    public DescribeDcdnUserDomainsRequest setChangeStartTime(String changeStartTime) {
        this.changeStartTime = changeStartTime;
        return this;
    }
    public String getChangeStartTime() {
        return this.changeStartTime;
    }

    public DescribeDcdnUserDomainsRequest setCheckDomainShow(Boolean checkDomainShow) {
        this.checkDomainShow = checkDomainShow;
        return this;
    }
    public Boolean getCheckDomainShow() {
        return this.checkDomainShow;
    }

    public DescribeDcdnUserDomainsRequest setCoverage(String coverage) {
        this.coverage = coverage;
        return this;
    }
    public String getCoverage() {
        return this.coverage;
    }

    public DescribeDcdnUserDomainsRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDcdnUserDomainsRequest setDomainSearchType(String domainSearchType) {
        this.domainSearchType = domainSearchType;
        return this;
    }
    public String getDomainSearchType() {
        return this.domainSearchType;
    }

    public DescribeDcdnUserDomainsRequest setDomainStatus(String domainStatus) {
        this.domainStatus = domainStatus;
        return this;
    }
    public String getDomainStatus() {
        return this.domainStatus;
    }

    public DescribeDcdnUserDomainsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDcdnUserDomainsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDcdnUserDomainsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDcdnUserDomainsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeDcdnUserDomainsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeDcdnUserDomainsRequest setTag(java.util.List<DescribeDcdnUserDomainsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeDcdnUserDomainsRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeDcdnUserDomainsRequestTag extends TeaModel {
        /**
         * <p>The tag key. Valid values of N: **1** to **20**. You can call the TagDcdnResources operation to set a tag for a domain name.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. Valid values of N: **1** to **20**.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDcdnUserDomainsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnUserDomainsRequestTag self = new DescribeDcdnUserDomainsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnUserDomainsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDcdnUserDomainsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
