// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class BindDBResourceGroupWithRoleShrinkRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the information about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The name of the resource group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testgroup</p>
     */
    @NameInMap("ResourceGroupName")
    public String resourceGroupName;

    /**
     * <p>The roles.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RoleList")
    public String roleListShrink;

    public static BindDBResourceGroupWithRoleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BindDBResourceGroupWithRoleShrinkRequest self = new BindDBResourceGroupWithRoleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BindDBResourceGroupWithRoleShrinkRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public BindDBResourceGroupWithRoleShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BindDBResourceGroupWithRoleShrinkRequest setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public BindDBResourceGroupWithRoleShrinkRequest setRoleListShrink(String roleListShrink) {
        this.roleListShrink = roleListShrink;
        return this;
    }
    public String getRoleListShrink() {
        return this.roleListShrink;
    }

}
