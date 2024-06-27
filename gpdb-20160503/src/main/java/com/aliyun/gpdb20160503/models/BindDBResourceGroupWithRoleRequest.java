// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class BindDBResourceGroupWithRoleRequest extends TeaModel {
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
    public java.util.List<String> roleList;

    public static BindDBResourceGroupWithRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        BindDBResourceGroupWithRoleRequest self = new BindDBResourceGroupWithRoleRequest();
        return TeaModel.build(map, self);
    }

    public BindDBResourceGroupWithRoleRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public BindDBResourceGroupWithRoleRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BindDBResourceGroupWithRoleRequest setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public BindDBResourceGroupWithRoleRequest setRoleList(java.util.List<String> roleList) {
        this.roleList = roleList;
        return this;
    }
    public java.util.List<String> getRoleList() {
        return this.roleList;
    }

}
