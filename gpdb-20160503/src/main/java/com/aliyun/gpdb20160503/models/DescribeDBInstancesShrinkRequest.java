// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBInstancesShrinkRequest extends TeaModel {
    /**
     * <p>The edition of the instance. Separate multiple values with commas (,).</p>
     */
    @NameInMap("DBInstanceCategories")
    public String DBInstanceCategoriesShrink;

    /**
     * <p>The description of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-bp12ga6v69h86****</p>
     */
    @NameInMap("DBInstanceDescription")
    public String DBInstanceDescription;

    /**
     * <p>The instance ID. Separate multiple values with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>gp-bp12ga6v69h86****</p>
     */
    @NameInMap("DBInstanceIds")
    public String DBInstanceIds;

    /**
     * <p>The resource type of the instance. Separate multiple values with commas (,).</p>
     */
    @NameInMap("DBInstanceModes")
    public String DBInstanceModesShrink;

    /**
     * <p>The state of the instance.</p>
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
     * <ul>
     * <li><strong>VPC</strong>: virtual private cloud (VPC).</li>
     * <li><strong>Classic</strong>: classic network.</li>
     * </ul>
     * <blockquote>
     * <p>If you do not specify this parameter, instances of all network types are returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. Pages start from page 1. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values:</p>
     * <ul>
     * <li><strong>30</strong></li>
     * <li><strong>50</strong></li>
     * <li><strong>100</strong></li>
     * </ul>
     * <p>Default value: <strong>30</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86912.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bp67acfmxazb4p****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeDBInstancesShrinkRequestTag> tag;

    /**
     * <p>The VPC ID. You can use this parameter to filter instances that reside in the specified VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-t4nqyp3tc5mx7vy6****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

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

    public DescribeDBInstancesShrinkRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class DescribeDBInstancesShrinkRequestTag extends TeaModel {
        /**
         * <p>The key of tag N.</p>
         * 
         * <strong>example:</strong>
         * <p>test-key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N.</p>
         * 
         * <strong>example:</strong>
         * <p>test-value</p>
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
