// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBInstancesShrinkRequest extends TeaModel {
    /**
     * <p>The edition of the instance. Separate multiple values with commas (,). Valid values:</p>
     * <br>
     * <p>*   **basic**: Basic Edition</p>
     * <p>*   **highavailability**: High-availability Edition</p>
     * <p>*   **finance**: Enterprise Edition</p>
     */
    @NameInMap("DBInstanceCategories")
    public String DBInstanceCategoriesShrink;

    /**
     * <p>The description of the instance.</p>
     */
    @NameInMap("DBInstanceDescription")
    public String DBInstanceDescription;

    /**
     * <p>The ID of the instance. Separate multiple IDs with commas (,).</p>
     */
    @NameInMap("DBInstanceIds")
    public String DBInstanceIds;

    /**
     * <p>The resource type of the instance. Separate multiple values with commas (,). Valid values:</p>
     * <br>
     * <p>*   **serverless**: Serverless mode</p>
     * <p>*   **storageelastic**: elastic storage mode</p>
     * <p>*   **classic**: reserved storage mode</p>
     */
    @NameInMap("DBInstanceModes")
    public String DBInstanceModesShrink;

    /**
     * <p>The state of the instance. Separate multiple values with commas (,). For more information, see [Instance statuses](~~86944~~).</p>
     * <br>
     * <p>>  The value of this parameter must be in lowercase.</p>
     */
    @NameInMap("DBInstanceStatuses")
    public String DBInstanceStatusesShrink;

    /**
     * <p>This parameter is no longer used.</p>
     */
    @NameInMap("InstanceDeployTypes")
    public String instanceDeployTypesShrink;

    /**
     * <p>The network type of the instance. Valid values:</p>
     * <br>
     * <p>*   **VPC**</p>
     * <p>*   **Classic**</p>
     * <br>
     * <p>>  If you do not specify this parameter, instances of both network types are returned.</p>
     */
    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of the page to return. The value must be an integer that is greater than 0. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values:</p>
     * <br>
     * <p>*   **30**</p>
     * <p>*   **50**</p>
     * <p>*   **100**</p>
     * <br>
     * <p>Default value: **30**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the instance.</p>
     * <br>
     * <p>>  You can call the [DescribeRegions](~~86912~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the instance belongs.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeDBInstancesShrinkRequestTag> tag;

    public static DescribeDBInstancesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancesShrinkRequest self = new DescribeDBInstancesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstancesShrinkRequest setDBInstanceCategoriesShrink(String DBInstanceCategoriesShrink) {
        this.DBInstanceCategoriesShrink = DBInstanceCategoriesShrink;
        return this;
    }
    public String getDBInstanceCategoriesShrink() {
        return this.DBInstanceCategoriesShrink;
    }

    public DescribeDBInstancesShrinkRequest setDBInstanceDescription(String DBInstanceDescription) {
        this.DBInstanceDescription = DBInstanceDescription;
        return this;
    }
    public String getDBInstanceDescription() {
        return this.DBInstanceDescription;
    }

    public DescribeDBInstancesShrinkRequest setDBInstanceIds(String DBInstanceIds) {
        this.DBInstanceIds = DBInstanceIds;
        return this;
    }
    public String getDBInstanceIds() {
        return this.DBInstanceIds;
    }

    public DescribeDBInstancesShrinkRequest setDBInstanceModesShrink(String DBInstanceModesShrink) {
        this.DBInstanceModesShrink = DBInstanceModesShrink;
        return this;
    }
    public String getDBInstanceModesShrink() {
        return this.DBInstanceModesShrink;
    }

    public DescribeDBInstancesShrinkRequest setDBInstanceStatusesShrink(String DBInstanceStatusesShrink) {
        this.DBInstanceStatusesShrink = DBInstanceStatusesShrink;
        return this;
    }
    public String getDBInstanceStatusesShrink() {
        return this.DBInstanceStatusesShrink;
    }

    public DescribeDBInstancesShrinkRequest setInstanceDeployTypesShrink(String instanceDeployTypesShrink) {
        this.instanceDeployTypesShrink = instanceDeployTypesShrink;
        return this;
    }
    public String getInstanceDeployTypesShrink() {
        return this.instanceDeployTypesShrink;
    }

    public DescribeDBInstancesShrinkRequest setInstanceNetworkType(String instanceNetworkType) {
        this.instanceNetworkType = instanceNetworkType;
        return this;
    }
    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
    }

    public DescribeDBInstancesShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDBInstancesShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDBInstancesShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDBInstancesShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDBInstancesShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeDBInstancesShrinkRequest setTag(java.util.List<DescribeDBInstancesShrinkRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeDBInstancesShrinkRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeDBInstancesShrinkRequestTag extends TeaModel {
        /**
         * <p>The key of tag N.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDBInstancesShrinkRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesShrinkRequestTag self = new DescribeDBInstancesShrinkRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesShrinkRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDBInstancesShrinkRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
