// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeUserDomainsRequest extends TeaModel {
    /**
     * <p>The type of workload accelerated by Alibaba Cloud CDN. Separate types with commas (,). Valid values:</p>
     * <ul>
     * <li><strong>web</strong>: images and small files</li>
     * <li><strong>download</strong>: large files</li>
     * <li><strong>video</strong>: on-demand video and audio streaming</li>
     * </ul>
     * <p>If you do not set this parameter, all service types are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>download,web,video</p>
     */
    @NameInMap("CdnType")
    public String cdnType;

    /**
     * <p>The end of the time range to query. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <blockquote>
     * <p>The end time must be later than the start time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2019-10-10T12:14:58Z</p>
     */
    @NameInMap("ChangeEndTime")
    public String changeEndTime;

    /**
     * <p>The beginning of the time range to query. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-10-10T12:14:55Z</p>
     */
    @NameInMap("ChangeStartTime")
    public String changeStartTime;

    /**
     * <p>Specifies whether to display domain names that are under review, failed the review, or failed to be configured. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CheckDomainShow")
    public Boolean checkDomainShow;

    /**
     * <p>The acceleration region. By default, all acceleration regions are queried. Valid values:</p>
     * <ul>
     * <li><strong>domestic</strong>: Chinese mainland</li>
     * <li><strong>global</strong>: global</li>
     * <li><strong>overseas</strong>: outside the Chinese mainland</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>domestic</p>
     */
    @NameInMap("Coverage")
    public String coverage;

    /**
     * <p>The accelerated domain. If you do not set this parameter, all domain names that match the conditions are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The search mode. Valid values:</p>
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
     * <li><strong>online</strong></li>
     * <li><strong>offline</strong></li>
     * <li><strong>configuring</strong></li>
     * <li><strong>configure_failed</strong></li>
     * <li><strong>checking</strong></li>
     * <li><strong>check_failed</strong></li>
     * <li><strong>stopping</strong></li>
     * <li><strong>deleting</strong></li>
     * </ul>
     * <p>If you do not set this parameter, domain names in all states are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>configure_failed</p>
     */
    @NameInMap("DomainStatus")
    public String domainStatus;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. Valid values: <strong>1</strong> to <strong>100000</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values: <strong>1 to 500</strong>. Default value: <strong>20</strong>. Maximum value: <strong>500</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the resource group. By default, all IDs are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>abcd1234abcd1234</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The information about the origin server.</p>
     * 
     * <strong>example:</strong>
     * <p>example.source.com</p>
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
         * <p>By default, all tag keys are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * <p>By default, all tag values are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
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
