// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class RevokeTablePermissionRequest extends TeaModel {
    /**
     * <p>The operation permissions on the table that you want to revoke. Separate multiple operation permissions with commas (,).</p>
     * <p>Currently, only the Select, Describe, and Download operation permissions on MaxCompute tables can be revoked.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Select,Describe</p>
     */
    @NameInMap("Actions")
    public String actions;

    /**
     * <p>The name of the MaxCompute project that contains the table from which you want to revoke permissions. You can log on to the DataWorks console and go to the Workspace Settings page to obtain the name of the MaxCompute project associated with the DataWorks workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aMaxcomputeProjectName</p>
     */
    @NameInMap("MaxComputeProjectName")
    public String maxComputeProjectName;

    /**
     * <p>The Alibaba Cloud account ID from which you want to revoke table permissions. You can logon to the DataWorks console and go to the Security Settings page to obtain the account ID.</p>
     * <p>You only need to specify either this parameter or the RevokeUserName parameter. If both this parameter and the RevokeUserName parameter are specified in the parameter settings but have different values, the value of the RevokeUserId parameter takes precedence.</p>
     * 
     * <strong>example:</strong>
     * <p>267842600408993176</p>
     */
    @NameInMap("RevokeUserId")
    public String revokeUserId;

    /**
     * <p>The name of the Alibaba Cloud account from which you want to revoke table permissions. The account format is the same as the account format used in MaxCompute.</p>
     * <ul>
     * <li>An Alibaba Cloud account is in the format of ALIYUN$+account name.</li>
     * <li>A RAM user is in the format of RAM$+account name.</li>
     * </ul>
     * <p>You only need to specify either this parameter or the RevokeUserId parameter. If both this parameter and the RevokeUserId parameter are specified in the parameter settings but have different values, the value of the RevokeUserId parameter takes precedence.</p>
     * 
     * <strong>example:</strong>
     * <p>RAM$dataworks_3h1_1:stsramuser</p>
     */
    @NameInMap("RevokeUserName")
    public String revokeUserName;

    /**
     * <p>The name of the MaxCompute table from which you want to revoke permissions. You can call the <a href="https://help.aliyun.com/document_detail/173919.html">SearchMetaTables</a> operation to obtain the MaxCompute table name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aTableName</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <p>The ID of the DataWorks workspace to which the MaxCompute table belongs. You can log on to the DataWorks console and go to the Workspace Settings page to obtain the workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
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
