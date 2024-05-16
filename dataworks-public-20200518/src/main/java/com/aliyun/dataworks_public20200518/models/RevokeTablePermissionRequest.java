// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class RevokeTablePermissionRequest extends TeaModel {
    /**
     * <p>The permissions that you want to revoke. Separate multiple permissions with commas (,).</p>
     * <br>
     * <p>You can revoke only the SELECT, DESCRIBE, and DOWNLOAD permissions on MaxCompute tables.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Actions")
    public String actions;

    /**
     * <p>The name of the MaxCompute project to which the table belongs. You can log on to the DataWorks console and go to the Workspace Management page to obtain the MaxCompute project name.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("MaxComputeProjectName")
    public String maxComputeProjectName;

    /**
     * <p>The ID of the Alibaba Cloud account from which you want to revoke permissions. You can log on to the DataWorks console and go to the Security Settings page to obtain the ID.</p>
     * <br>
     * <p>You must specify either this parameter or RevokeUserName. If you specify both this parameter and RevokeUserName, the value of this parameter prevails.</p>
     */
    @NameInMap("RevokeUserId")
    public String revokeUserId;

    /**
     * <p>The Alibaba Cloud account from which you want to revoke permissions. Specify this parameter in the format that is the same as the format of the account used to access the MaxCompute project.</p>
     * <br>
     * <p>*   If you want to revoke permissions from an Alibaba Cloud account, specify this parameter in the ALIYUN$+Alibaba Cloud account format.</p>
     * <p>*   If you want to revoke permissions from a Resource Access Management (RAM) user, specify this parameter in the RAM$+RAM user format.</p>
     * <br>
     * <p>You must specify either this parameter or RevokeUserId. If you specify both this parameter and RevokeUserId, the value of RevokeUserId prevails.</p>
     */
    @NameInMap("RevokeUserName")
    public String revokeUserName;

    /**
     * <p>The name of the MaxCompute table. You can call the [SearchMetaTables](https://help.aliyun.com/document_detail/173919.html) operation to query the table name.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <p>The ID of the DataWorks workspace with which the MaxCompute project is associated. You can log on to the DataWorks console and go to the Workspace Management page to obtain the ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorkspaceId")
    public Long workspaceId;

    public static RevokeTablePermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeTablePermissionRequest self = new RevokeTablePermissionRequest();
        return TeaModel.build(map, self);
    }

    public RevokeTablePermissionRequest setActions(String actions) {
        this.actions = actions;
        return this;
    }
    public String getActions() {
        return this.actions;
    }

    public RevokeTablePermissionRequest setMaxComputeProjectName(String maxComputeProjectName) {
        this.maxComputeProjectName = maxComputeProjectName;
        return this;
    }
    public String getMaxComputeProjectName() {
        return this.maxComputeProjectName;
    }

    public RevokeTablePermissionRequest setRevokeUserId(String revokeUserId) {
        this.revokeUserId = revokeUserId;
        return this;
    }
    public String getRevokeUserId() {
        return this.revokeUserId;
    }

    public RevokeTablePermissionRequest setRevokeUserName(String revokeUserName) {
        this.revokeUserName = revokeUserName;
        return this;
    }
    public String getRevokeUserName() {
        return this.revokeUserName;
    }

    public RevokeTablePermissionRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public RevokeTablePermissionRequest setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

}
