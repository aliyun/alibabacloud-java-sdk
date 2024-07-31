// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class RevokeColumnPermissionRequest extends TeaModel {
    /**
     * <p>The fields for which you want to revoke permissions from a user. Separate multiple fields with commas (,). You can revoke the permissions on the fields only in MaxCompute tables.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>id,name</p>
     */
    @NameInMap("Columns")
    public String columns;

    /**
     * <p>The name of the MaxCompute project to which the fields belong. You can log on to the DataWorks console and go to the SettingCenter page to obtain the name of the MaxCompute project that you associate with the workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aMaxcomputeProjectName</p>
     */
    @NameInMap("MaxComputeProjectName")
    public String maxComputeProjectName;

    /**
     * <p>The ID of the Alibaba Cloud account of the user from which you want to revoke permissions. You can log on to the DataWorks console and go to the Security Settings page to obtain the ID. You must specify either this parameter or the RevokeUserName parameter. If you specify both this parameter and the RevokeUserName parameter and the parameter values are different, the value of this parameter prevails.</p>
     * 
     * <strong>example:</strong>
     * <p>267842600408993176</p>
     */
    @NameInMap("RevokeUserId")
    public String revokeUserId;

    /**
     * <p>The Alibaba Cloud account from which you want to revoke permissions. Specify this parameter in the format that is the same as the format of the account used to access the MaxCompute project.</p>
     * <ul>
     * <li>If the account is an Alibaba Cloud account, the value is in the ALIYUN$+Account name format.</li>
     * <li>If the account is a RAM user, the value is in the RAM$+Account name format.</li>
     * </ul>
     * <p>You must specify either this parameter or the RevokeUserId parameter. If you specify both this parameter and the RevokeUserId parameter and the parameter values are different, the value of the RevokeUserId parameter prevails.</p>
     * 
     * <strong>example:</strong>
     * <p>RAM$dataworks_3h1_1:stsramuser</p>
     */
    @NameInMap("RevokeUserName")
    public String revokeUserName;

    /**
     * <p>The name of the MaxCompute table to which the fields belong. You can call the <a href="https://help.aliyun.com/document_detail/173919.html">SearchMetaTables</a> operation to query the name of the MaxCompute table.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aTableName</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <p>The ID of the DataWorks workspace with which the MaxCompute project is associated. You can log on to the DataWorks console and go to the Workspace page to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
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
