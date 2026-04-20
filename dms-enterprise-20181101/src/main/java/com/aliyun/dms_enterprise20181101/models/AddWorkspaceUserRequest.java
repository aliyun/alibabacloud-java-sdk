// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class AddWorkspaceUserRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123***</p>
     */
    @NameInMap("DmsUserIds")
    public String dmsUserIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>31****</p>
     */
    @NameInMap("RoleId")
    public String roleId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>INNER</p>
     */
    @NameInMap("RoleSource")
    public String roleSource;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static AddWorkspaceUserRequest build(java.util.Map<String, ?> map) throws Exception {
        AddWorkspaceUserRequest self = new AddWorkspaceUserRequest();
        return TeaModel.build(map, self);
    }

    public AddWorkspaceUserRequest setDmsUserIds(String dmsUserIds) {
        this.dmsUserIds = dmsUserIds;
        return this;
    }
    public String getDmsUserIds() {
        return this.dmsUserIds;
    }

    public AddWorkspaceUserRequest setRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }
    public String getRoleId() {
        return this.roleId;
    }

    public AddWorkspaceUserRequest setRoleSource(String roleSource) {
        this.roleSource = roleSource;
        return this;
    }
    public String getRoleSource() {
        return this.roleSource;
    }

    public AddWorkspaceUserRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
