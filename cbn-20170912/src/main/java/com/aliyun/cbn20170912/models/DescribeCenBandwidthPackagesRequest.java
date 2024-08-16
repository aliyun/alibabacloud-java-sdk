// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCenBandwidthPackagesRequest extends TeaModel {
    /**
     * <p>The filter configurations.</p>
     */
    @NameInMap("Filter")
    public java.util.List<DescribeCenBandwidthPackagesRequestFilter> filter;

    /**
     * <p>Specifies whether to include renewal data. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludeReservationData")
    public Boolean includeReservationData;

    /**
     * <p>The logical operator between the filter conditions. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default): <strong>AND</strong> Bandwidth plans that meet all filter conditions are returned.</li>
     * <li><strong>true</strong>: <strong>OR</strong> Bandwidth plans that meet one of the filter conditions are returned.</li>
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
     * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Maximum value: <strong>50</strong>. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the resource group.</p>
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
     * <p>The information about the tags.</p>
     * <p>You can specify at most 20 tags in each call.</p>
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
         * <p>The filter conditions. You can use filter conditions to filter the bandwidth plans that you want to query. The following filter conditions are supported:</p>
         * <ul>
         * <li><p><strong>CenId</strong>: CEN instance ID</p>
         * </li>
         * <li><p><strong>Status</strong>: bandwidth plan status. Valid values:</p>
         * <ul>
         * <li><strong>Idle</strong>: not associated with a CEN instance.</li>
         * <li><strong>InUse</strong>: associated with a CEN instance.</li>
         * </ul>
         * </li>
         * <li><p><strong>CenBandwidthPackageId</strong>: bandwidth plan ID</p>
         * </li>
         * <li><p><strong>Name</strong>: bandwidth plan name You can specify one or more filter conditions. The maximum value of <strong>N</strong> is <strong>5</strong>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CenId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>Specify a filter value based on the <strong>Key</strong> parameter. You can specify multiple filter values for each <strong>Key</strong>. The logical operator between filter values is <strong>OR</strong>. If one filter value is matched, the filter condition is matched.</p>
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
         * <p>The tag keys.</p>
         * <p>The tag keys cannot be an empty string. The tag keys can be up to 64 characters in length and cannot start with <code>acs:</code> or <code>aliyun</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>You can specify at most 20 tag keys.</p>
         * 
         * <strong>example:</strong>
         * <p>TagKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag values.</p>
         * <p>The tag values can be 0 to 128 characters in length, and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>The tag value of each tag key must be unique. You can specify at most 20 tag values in each call.</p>
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
