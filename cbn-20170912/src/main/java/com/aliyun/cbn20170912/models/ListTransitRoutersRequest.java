// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRoutersRequest extends TeaModel {
    /**
     * <p>The ID of the CEN instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cen-j3jzhw1zpau2km****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The field that is used to enable or disable a feature of the transit router.</p>
     */
    @NameInMap("FeatureFilter")
    public java.util.List<ListTransitRoutersRequestFeatureFilter> featureFilter;

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
     * <p>The number of entries to return on each page. Valid values: <strong>1</strong> to <strong>50</strong>. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region where the transit router is deployed.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The status of the transit router. Valid values:</p>
     * <ul>
     * <li><strong>Creating</strong>: The transit router is being created.</li>
     * <li><strong>Active</strong>: The transit router is available.</li>
     * <li><strong>Modifying</strong>: The transit router is being modified</li>
     * <li><strong>Deleting</strong>: The transit router is being deleted.</li>
     * <li><strong>Upgrading</strong>: The transit router is being upgraded.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The information about the tags.</p>
     * <p>You can specify at most 20 tags in each call.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListTransitRoutersRequestTag> tag;

    /**
     * <p>The ID of the transit router.</p>
     * 
     * <strong>example:</strong>
     * <p>tr-uf654ttymmljlvh2x****</p>
     */
    @NameInMap("TransitRouterId")
    public String transitRouterId;

    /**
     * <p>The name of the Enterprise Edition transit router.</p>
     * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter but cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>testname</p>
     */
    @NameInMap("TransitRouterName")
    public String transitRouterName;

    /**
     * <p>The edition of the transit router. Valid values:</p>
     * <ul>
     * <li><strong>Enterprise</strong>: Enhance Edition</li>
     * <li><strong>Basic</strong>: Basic Edition</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enterprise</p>
     */
    @NameInMap("Type")
    public String type;

    public static ListTransitRoutersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTransitRoutersRequest self = new ListTransitRoutersRequest();
        return TeaModel.build(map, self);
    }

    public ListTransitRoutersRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public ListTransitRoutersRequest setFeatureFilter(java.util.List<ListTransitRoutersRequestFeatureFilter> featureFilter) {
        this.featureFilter = featureFilter;
        return this;
    }
    public java.util.List<ListTransitRoutersRequestFeatureFilter> getFeatureFilter() {
        return this.featureFilter;
    }

    public ListTransitRoutersRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListTransitRoutersRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListTransitRoutersRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTransitRoutersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTransitRoutersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListTransitRoutersRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListTransitRoutersRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListTransitRoutersRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListTransitRoutersRequest setTag(java.util.List<ListTransitRoutersRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListTransitRoutersRequestTag> getTag() {
        return this.tag;
    }

    public ListTransitRoutersRequest setTransitRouterId(String transitRouterId) {
        this.transitRouterId = transitRouterId;
        return this;
    }
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

    public ListTransitRoutersRequest setTransitRouterName(String transitRouterName) {
        this.transitRouterName = transitRouterName;
        return this;
    }
    public String getTransitRouterName() {
        return this.transitRouterName;
    }

    public ListTransitRoutersRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class ListTransitRoutersRequestFeatureFilter extends TeaModel {
        /**
         * <p>The value of the field that is used to enable or disable a feature of the transit router. Supported fields:</p>
         * <ul>
         * <li><strong>Multicast</strong>: the multicast feature.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Multicast</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The fields that are used to enable or disable the features of the transit router. The <strong>Multicast</strong> field supports only one value. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: enables multicast.</li>
         * <li><strong>Disabled</strong>: disables multicast.</li>
         * </ul>
         */
        @NameInMap("Value")
        public java.util.List<String> value;

        public static ListTransitRoutersRequestFeatureFilter build(java.util.Map<String, ?> map) throws Exception {
            ListTransitRoutersRequestFeatureFilter self = new ListTransitRoutersRequestFeatureFilter();
            return TeaModel.build(map, self);
        }

        public ListTransitRoutersRequestFeatureFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListTransitRoutersRequestFeatureFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

    public static class ListTransitRoutersRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * <p>The tag key cannot be an empty string. The tag key can be up to 64 characters in length and cannot start with <code>acs:</code> or <code>aliyun</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>You can specify at most 20 tag keys.</p>
         * 
         * <strong>example:</strong>
         * <p>TagKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * <p>The tag value can be 0 to 128 characters in length, and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>Each tag key must have a unique tag value. You can specify at most 20 tag values in each call.</p>
         * 
         * <strong>example:</strong>
         * <p>TagValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListTransitRoutersRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListTransitRoutersRequestTag self = new ListTransitRoutersRequestTag();
            return TeaModel.build(map, self);
        }

        public ListTransitRoutersRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListTransitRoutersRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
