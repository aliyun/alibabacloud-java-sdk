// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class RevokeTablePermissionRequest extends TeaModel {
    @NameInMap("Actions")
    public String actions;

    @NameInMap("MaxComputeProjectName")
    public String maxComputeProjectName;

    @NameInMap("RevokeUserId")
    public String revokeUserId;

    @NameInMap("RevokeUserName")
    public String revokeUserName;

    @NameInMap("TableName")
    public String tableName;

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
