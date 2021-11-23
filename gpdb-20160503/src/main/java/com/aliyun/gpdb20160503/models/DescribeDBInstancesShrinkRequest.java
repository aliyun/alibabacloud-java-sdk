// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBInstancesShrinkRequest extends TeaModel {
    @NameInMap("DBInstanceCategories")
    public String DBInstanceCategoriesShrink;

    @NameInMap("DBInstanceDescription")
    public String DBInstanceDescription;

    @NameInMap("DBInstanceIds")
    public String DBInstanceIds;

    @NameInMap("DBInstanceModes")
    public String DBInstanceModesShrink;

    @NameInMap("DBInstanceStatuses")
    public String DBInstanceStatusesShrink;

    @NameInMap("InstanceDeployTypes")
    public String instanceDeployTypesShrink;

    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

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

    public DescribeDBInstancesShrinkRequest setTag(java.util.List<DescribeDBInstancesShrinkRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeDBInstancesShrinkRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeDBInstancesShrinkRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

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
