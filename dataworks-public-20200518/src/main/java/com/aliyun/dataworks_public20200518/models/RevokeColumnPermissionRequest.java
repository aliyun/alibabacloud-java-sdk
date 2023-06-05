// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class RevokeColumnPermissionRequest extends TeaModel {
    /**
     * <p>The Alibaba Cloud account of the user from whom you want to revoke permissions. Specify this parameter in the format that is the same as the format of the account used to access the MaxCompute project.</p>
     * <br>
     * <p>*   If you want to revoke permissions from an Alibaba Cloud account, specify this parameter in the ALIYUN$+Alibaba Cloud account format.</p>
     * <p>*   If you want to revoke permissions from a Resource Access Management (RAM) user, specify this parameter in the RAM$+RAM user format.</p>
     * <br>
     * <p>You must specify either this parameter or RevokeUserId. If you specify both this parameter and RevokeUserId, the value of RevokeUserId prevails.</p>
     */
    @NameInMap("Columns")
    public String columns;

    /**
     * <p>The name of the MaxCompute table to which the destination fields belong. You can call the [SearchMetaTables](~~173919~~) operation to query the name.</p>
     */
    @NameInMap("MaxComputeProjectName")
    public String maxComputeProjectName;

    /**
     * <p>Indicates whether the permissions on table fields are revoked.</p>
     */
    @NameInMap("RevokeUserId")
    public String revokeUserId;

    /**
     * <p>The ID of the Alibaba Cloud account of the user from whom you want to revoke permissions. You can log on to the DataWorks console and go to the Security Settings page to obtain the ID.</p>
     * <br>
     * <p>You must specify either this parameter or RevokeUserName. If you specify both this parameter and RevokeUserName, the value of this parameter prevails.</p>
     */
    @NameInMap("RevokeUserName")
    public String revokeUserName;

    /**
     * <p>The fields for which you want to revoke permissions from a user. Separate multiple fields with commas (,).</p>
     * <br>
     * <p>You can revoke the permissions on the fields only in MaxCompute tables.</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <p>The name of the MaxCompute project to which the destination fields belong. You can log on to the DataWorks console and go to the Workspace Management page to obtain the name of the MaxCompute project that is associated with the workspace.</p>
     */
    @NameInMap("WorkspaceId")
    public Long workspaceId;

    public static RevokeColumnPermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeColumnPermissionRequest self = new RevokeColumnPermissionRequest();
        return TeaModel.build(map, self);
    }

    public RevokeColumnPermissionRequest setColumns(String columns) {
        this.columns = columns;
        return this;
    }
    public String getColumns() {
        return this.columns;
    }

    public RevokeColumnPermissionRequest setMaxComputeProjectName(String maxComputeProjectName) {
        this.maxComputeProjectName = maxComputeProjectName;
        return this;
    }
    public String getMaxComputeProjectName() {
        return this.maxComputeProjectName;
    }

    public RevokeColumnPermissionRequest setRevokeUserId(String revokeUserId) {
        this.revokeUserId = revokeUserId;
        return this;
    }
    public String getRevokeUserId() {
        return this.revokeUserId;
    }

    public RevokeColumnPermissionRequest setRevokeUserName(String revokeUserName) {
        this.revokeUserName = revokeUserName;
        return this;
    }
    public String getRevokeUserName() {
        return this.revokeUserName;
    }

    public RevokeColumnPermissionRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public RevokeColumnPermissionRequest setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

}
