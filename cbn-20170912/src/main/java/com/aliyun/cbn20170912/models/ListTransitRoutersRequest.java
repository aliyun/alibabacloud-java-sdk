// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRoutersRequest extends TeaModel {
    /**
     * <p>The CEN instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cen-j3jzhw1zpau2km****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The feature filter for transit routers.</p>
     */
    @NameInMap("FeatureFilter")
    public java.util.List<ListTransitRoutersRequestFeatureFilter> featureFilter;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page in a paged query. Valid values: <strong>1</strong> to <strong>50</strong>. Default value: <strong>10</strong>. For more information about paging, see the related parameter descriptions.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the transit router instance.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
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
     * <p>The status of the transit router instance. Valid values:</p>
     * <ul>
     * <li><strong>Creating</strong>: being created.</li>
     * <li><strong>Active</strong>: active.</li>
     * <li><strong>Modifying</strong>: being modified.</li>
     * <li><strong>Deleting</strong>: being deleted.</li>
     * <li><strong>Upgrading</strong>: being upgraded.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tag information.</p>
     * <p>You can specify up to 20 tags at a time.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListTransitRoutersRequestTag> tag;

    /**
     * <p>The transit router instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>tr-uf654ttymmljlvh2x****</p>
     */
    @NameInMap("TransitRouterId")
    public String transitRouterId;

    /**
     * <p>The name of the transit router instance.</p>
     * <p>The name must be 1 to 128 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>testname</p>
     */
    @NameInMap("TransitRouterName")
    public String transitRouterName;

    /**
     * <p>The type of the transit router instance. Valid values:</p>
     * <ul>
     * <li><strong>Enterprise</strong>: Enterprise Edition transit router.</li>
     * <li><strong>Basic</strong>: Basic Edition transit router.</li>
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
         * <p>The key of the feature filter for transit routers. Currently supported fields:</p>
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
         * <p>The list of values for the feature filter of transit routers. When the key is <strong>Multicast</strong>, only one value is supported. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: multicast is supported.</li>
         * <li><strong>Disabled</strong>: multicast is not supported.</li>
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
         * <p>The tag key of the resource.</p>
         * <p>The tag key cannot be an empty string. The tag key can be up to 64 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>You can specify up to 20 tag keys at a time.</p>
         * 
         * <strong>example:</strong>
         * <p>TagKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the resource.</p>
         * <p>The tag value can be an empty string or up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>Each tag key corresponds to one tag value. You can specify up to 20 tag values at a time.</p>
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
