// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnUserDomainsRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC+0.</p>
     * <blockquote>
     * <p>The end time must be later than the start time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2018-05-10T14:00:00Z</p>
     */
    @NameInMap("ChangeEndTime")
    public String changeEndTime;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC+0.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-05-10T12:00:00Z</p>
     */
    @NameInMap("ChangeStartTime")
    public String changeStartTime;

    /**
     * <p>Specifies whether to display domain names that are under review, failed the review, or failed to be configured. Valid values:</p>
     * <ul>
     * <li>true: displays domain names.</li>
     * <li>false: does not display detailed information.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CheckDomainShow")
    public Boolean checkDomainShow;

    /**
     * <p>The acceleration region. By default, all acceleration regions are queried.</p>
     * <ul>
     * <li><strong>domestic</strong>: Chinese mainland</li>
     * <li><strong>overseas</strong>: outside the Chinese mainland</li>
     * <li><strong>global</strong>: global</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>domestic</p>
     */
    @NameInMap("Coverage")
    public String coverage;

    /**
     * <p>The accelerated domain names. If you do not set this parameter, configurations of all domain names that match the conditions are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The search method. Default value: full_match. Valid values:</p>
     * <ul>
     * <li><strong>fuzzy_match</strong>: fuzzy match</li>
     * <li><strong>pre_match</strong>: prefix match</li>
     * <li><strong>suf_match</strong>: suffix match</li>
     * <li><strong>full_match</strong> (default): exact match</li>
     * </ul>
     * <blockquote>
     * <p>If you specify the domain names to query but do not set the DomainSearchType parameter, the exact match mode is used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>fuzzy_match</p>
     */
    @NameInMap("DomainSearchType")
    public String domainSearchType;

    /**
     * <p>The status of the domain name. Valid values:</p>
     * <ul>
     * <li><strong>online</strong>: enabled</li>
     * <li><strong>offline</strong>: disabled</li>
     * <li><strong>configuring</strong>: configuring</li>
     * <li><strong>configure_failed</strong>: configuration failed</li>
     * <li><strong>checking</strong>: reviewing</li>
     * <li><strong>check_failed:</strong> review failed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>online</p>
     */
    @NameInMap("DomainStatus")
    public String domainStatus;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of returned pages. Valid values: <strong>1</strong> to <strong>100000</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: <strong>20</strong>. Valid values: <strong>1</strong> to <strong>500</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmv6jutt**</p>
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

    /**
     * <p>The business type of the domain. Separate multiple values with commas (,). Default value: <strong>dynamic</strong>. To query common domains, keep the default value. To query domains of the computing business type, enter <strong>computing_routine</strong> or <strong>computing_image</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>computing_routine</p>
     */
    @NameInMap("WebSiteType")
    public String webSiteType;

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

    public DescribeDcdnUserDomainsRequest setWebSiteType(String webSiteType) {
        this.webSiteType = webSiteType;
        return this;
    }
    public String getWebSiteType() {
        return this.webSiteType;
    }

    public static class DescribeDcdnUserDomainsRequestTag extends TeaModel {
        /**
         * <p>The tag key. Valid values of N: <strong>1</strong> to <strong>20</strong>. You can call the TagDcdnResources operation to set a tag for a domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. Valid values of N: <strong>1</strong> to <strong>20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
