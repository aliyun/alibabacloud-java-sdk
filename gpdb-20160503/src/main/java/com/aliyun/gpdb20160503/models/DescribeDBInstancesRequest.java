// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBInstancesRequest extends TeaModel {
    /**
     * <p>The edition of the instance. Separate multiple values with commas (,).</p>
     */
    @NameInMap("DBInstanceCategories")
    public java.util.List<String> DBInstanceCategories;

    /**
     * <p>The description of the instance.</p>
     */
    @NameInMap("DBInstanceDescription")
    public String DBInstanceDescription;

    /**
     * <p>The instance ID. Separate multiple values with commas (,).</p>
     */
    @NameInMap("DBInstanceIds")
    public String DBInstanceIds;

    /**
     * <p>The resource type of the instance. Separate multiple values with commas (,).</p>
     */
    @NameInMap("DBInstanceModes")
    public java.util.List<String> DBInstanceModes;

    /**
     * <p>The state of the instance.</p>
     */
    @NameInMap("DBInstanceStatuses")
    public java.util.List<String> DBInstanceStatuses;

    /**
     * <p>This parameter is no longer used.</p>
     */
    @NameInMap("InstanceDeployTypes")
    public java.util.List<String> instanceDeployTypes;

    /**
     * <p>The network type of the instance. Valid values:</p>
     * <br>
     * <p>*   **VPC**: virtual private cloud (VPC).</p>
     * <p>*   **Classic**: classic network.</p>
     * <br>
     * <p>> If you do not specify this parameter, instances of all network types are returned.</p>
     */
    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. Pages start from page 1. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values:</p>
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
     * <p>The region ID.</p>
     * <br>
     * <p>> You can call the [DescribeRegions](~~86912~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the instance belongs.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tag value.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeDBInstancesRequestTag> tag;

    public static DescribeDBInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancesRequest self = new DescribeDBInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstancesRequest setDBInstanceCategories(java.util.List<String> DBInstanceCategories) {
        this.DBInstanceCategories = DBInstanceCategories;
        return this;
    }
    public java.util.List<String> getDBInstanceCategories() {
        return this.DBInstanceCategories;
    }

    public DescribeDBInstancesRequest setDBInstanceDescription(String DBInstanceDescription) {
        this.DBInstanceDescription = DBInstanceDescription;
        return this;
    }
    public String getDBInstanceDescription() {
        return this.DBInstanceDescription;
    }

    public DescribeDBInstancesRequest setDBInstanceIds(String DBInstanceIds) {
        this.DBInstanceIds = DBInstanceIds;
        return this;
    }
    public String getDBInstanceIds() {
        return this.DBInstanceIds;
    }

    public DescribeDBInstancesRequest setDBInstanceModes(java.util.List<String> DBInstanceModes) {
        this.DBInstanceModes = DBInstanceModes;
        return this;
    }
    public java.util.List<String> getDBInstanceModes() {
        return this.DBInstanceModes;
    }

    public DescribeDBInstancesRequest setDBInstanceStatuses(java.util.List<String> DBInstanceStatuses) {
        this.DBInstanceStatuses = DBInstanceStatuses;
        return this;
    }
    public java.util.List<String> getDBInstanceStatuses() {
        return this.DBInstanceStatuses;
    }

    public DescribeDBInstancesRequest setInstanceDeployTypes(java.util.List<String> instanceDeployTypes) {
        this.instanceDeployTypes = instanceDeployTypes;
        return this;
    }
    public java.util.List<String> getInstanceDeployTypes() {
        return this.instanceDeployTypes;
    }

    public DescribeDBInstancesRequest setInstanceNetworkType(String instanceNetworkType) {
        this.instanceNetworkType = instanceNetworkType;
        return this;
    }
    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
    }

    public DescribeDBInstancesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDBInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDBInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDBInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDBInstancesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeDBInstancesRequest setTag(java.util.List<DescribeDBInstancesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeDBInstancesRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeDBInstancesRequestTag extends TeaModel {
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

        public static DescribeDBInstancesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesRequestTag self = new DescribeDBInstancesRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDBInstancesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
