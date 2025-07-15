// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveUserDomainsRequest extends TeaModel {
    /**
     * <p>The domain name that is used as a keyword to filter domain names. Fuzzy match is supported.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>If you set LiveDomainType to liveVideo and leave this parameter empty, the streaming domains are queried. - If you set LiveDomainType to liveEdge and leave this parameter empty, the ingest domains are queried.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>*.aliyundoc.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The search mode. Valid values:</p>
     * <ul>
     * <li><strong>fuzzy_match</strong> (default): fuzzy match</li>
     * <li><strong>pre_match</strong>: prefix match</li>
     * <li><strong>suf_match</strong>: suffix match</li>
     * <li><strong>full_match</strong>: exact match</li>
     * </ul>
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
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>online</p>
     */
    @NameInMap("DomainStatus")
    public String domainStatus;

    /**
     * <p>The type of the domain name. Valid values:</p>
     * <ul>
     * <li><strong>liveVideo</strong>: streaming domain</li>
     * <li><strong>liveEdge</strong>: ingest domain</li>
     * </ul>
     * <blockquote>
     * <p> If you leave this parameter empty, all ingest domains and streaming domains within your Alibaba Cloud account are queried by default.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>liveVideo</p>
     */
    @NameInMap("LiveDomainType")
    public String liveDomainType;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. Valid values: <strong>1 to 100000</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: <strong>20</strong>. Maximum value: <strong>50</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region in which the domain name resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionName")
    public String regionName;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek2egyoep3jp7a</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeLiveUserDomainsRequestTag> tag;

    public static DescribeLiveUserDomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveUserDomainsRequest self = new DescribeLiveUserDomainsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveUserDomainsRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveUserDomainsRequest setDomainSearchType(String domainSearchType) {
        this.domainSearchType = domainSearchType;
        return this;
    }
    public String getDomainSearchType() {
        return this.domainSearchType;
    }

    public DescribeLiveUserDomainsRequest setDomainStatus(String domainStatus) {
        this.domainStatus = domainStatus;
        return this;
    }
    public String getDomainStatus() {
        return this.domainStatus;
    }

    public DescribeLiveUserDomainsRequest setLiveDomainType(String liveDomainType) {
        this.liveDomainType = liveDomainType;
        return this;
    }
    public String getLiveDomainType() {
        return this.liveDomainType;
    }

    public DescribeLiveUserDomainsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLiveUserDomainsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeLiveUserDomainsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLiveUserDomainsRequest setRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }
    public String getRegionName() {
        return this.regionName;
    }

    public DescribeLiveUserDomainsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeLiveUserDomainsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeLiveUserDomainsRequest setTag(java.util.List<DescribeLiveUserDomainsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeLiveUserDomainsRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeLiveUserDomainsRequestTag extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeLiveUserDomainsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveUserDomainsRequestTag self = new DescribeLiveUserDomainsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeLiveUserDomainsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeLiveUserDomainsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
