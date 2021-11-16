// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class RevokeColumnPermissionRequest extends TeaModel {
    @NameInMap("Columns")
    public String columns;

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
