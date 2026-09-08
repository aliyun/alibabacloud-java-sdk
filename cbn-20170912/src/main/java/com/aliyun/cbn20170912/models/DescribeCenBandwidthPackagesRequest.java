// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCenBandwidthPackagesRequest extends TeaModel {
    /**
     * <p>The filter information.</p>
     */
    @NameInMap("Filter")
    public java.util.List<DescribeCenBandwidthPackagesRequestFilter> filter;

    /**
     * <p>Specifies whether to include renewal data. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Includes renewal data.</p>
     * </li>
     * <li><p><strong>false</strong>: Does not include renewal data.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludeReservationData")
    public Boolean includeReservationData;

    /**
     * <p>The logical relationship between filter conditions. Valid values:</p>
     * <ul>
     * <li><p><strong>false</strong> (default): The filter conditions have an <strong>AND</strong> relationship. A bandwidth package must match all filter conditions to be returned.</p>
     * </li>
     * <li><p><strong>true</strong>: The filter conditions have an <strong>OR</strong> relationship. A bandwidth package that matches any filter condition is returned.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsOrKey")
    public Boolean isOrKey;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number of the list. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page for a paged query. Maximum value: <strong>50</strong>. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfnwjeo4tv****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The tag information list.</p>
     * <p>You can specify up to 20 tags at a time.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeCenBandwidthPackagesRequestTag> tag;

    public static DescribeCenBandwidthPackagesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCenBandwidthPackagesRequest self = new DescribeCenBandwidthPackagesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCenBandwidthPackagesRequest setFilter(java.util.List<DescribeCenBandwidthPackagesRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<DescribeCenBandwidthPackagesRequestFilter> getFilter() {
        return this.filter;
    }

    public DescribeCenBandwidthPackagesRequest setIncludeReservationData(Boolean includeReservationData) {
        this.includeReservationData = includeReservationData;
        return this;
    }
    public Boolean getIncludeReservationData() {
        return this.includeReservationData;
    }

    public DescribeCenBandwidthPackagesRequest setIsOrKey(Boolean isOrKey) {
        this.isOrKey = isOrKey;
        return this;
    }
    public Boolean getIsOrKey() {
        return this.isOrKey;
    }

    public DescribeCenBandwidthPackagesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeCenBandwidthPackagesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeCenBandwidthPackagesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCenBandwidthPackagesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCenBandwidthPackagesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeCenBandwidthPackagesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeCenBandwidthPackagesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeCenBandwidthPackagesRequest setTag(java.util.List<DescribeCenBandwidthPackagesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeCenBandwidthPackagesRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeCenBandwidthPackagesRequestFilter extends TeaModel {
        /**
         * <p>The filter condition.
         * You can use filter conditions to filter the bandwidth package instances to query. The following filter conditions are supported:</p>
         * <ul>
         * <li><p><strong>CenId</strong>: The ID of the Cloud Enterprise Network (CEN) instance.</p>
         * </li>
         * <li><p><strong>Status</strong>: The status of the bandwidth package instance. Valid values:</p>
         * <ul>
         * <li><strong>Idle</strong>: Not associated.</li>
         * <li><strong>InUse</strong>: Associated.</li>
         * </ul>
         * </li>
         * <li><p><strong>CenBandwidthPackageId</strong>: The ID of the bandwidth package.</p>
         * </li>
         * <li><p><strong>Name</strong>: The name of the bandwidth package.
         * You can specify one or more filter conditions. The maximum value of <strong>N</strong> is <strong>5</strong>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CenId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The filter values based on the specified <strong>Key</strong>. You can specify multiple filter values for a single <strong>Key</strong>. The filter values have an <strong>OR</strong> relationship, which means that a bandwidth package matching any of the filter values is considered a match for the filter condition.</p>
         * 
         * <strong>example:</strong>
         * <p>Idle</p>
         */
        @NameInMap("Value")
        public java.util.List<String> value;

        public static DescribeCenBandwidthPackagesRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenBandwidthPackagesRequestFilter self = new DescribeCenBandwidthPackagesRequestFilter();
            return TeaModel.build(map, self);
        }

        public DescribeCenBandwidthPackagesRequestFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeCenBandwidthPackagesRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

    public static class DescribeCenBandwidthPackagesRequestTag extends TeaModel {
        /**
         * <p>The tag key of the resource.</p>
         * <p>Once specified, the tag key cannot be an empty string. The tag key can be up to 64 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>You can specify up to 20 tag keys at a time.</p>
         * 
         * <strong>example:</strong>
         * <p>TagKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the resource.</p>
         * <p>The tag value can be empty or a string of up to 128 characters. It cannot start with <code>aliyun</code> or <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>Each tag key corresponds to one tag value. You can specify up to 20 tag values at a time.</p>
         * 
         * <strong>example:</strong>
         * <p>TagValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeCenBandwidthPackagesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenBandwidthPackagesRequestTag self = new DescribeCenBandwidthPackagesRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeCenBandwidthPackagesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeCenBandwidthPackagesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
