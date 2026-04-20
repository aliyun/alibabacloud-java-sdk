// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateWorkspaceUserRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123***</p>
     */
    @NameInMap("DmsUserId")
    public String dmsUserId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>11,12</p>
     */
    @NameInMap("RoleIds")
    public String roleIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UpdateWorkspaceUserRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkspaceUserRequest self = new UpdateWorkspaceUserRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWorkspaceUserRequest setDmsUserId(String dmsUserId) {
        this.dmsUserId = dmsUserId;
        return this;
    }
    public String getDmsUserId() {
        return this.dmsUserId;
    }

    public UpdateWorkspaceUserRequest setRoleIds(String roleIds) {
        this.roleIds = roleIds;
        return this;
    }
    public String getRoleIds() {
        return this.roleIds;
    }

    public UpdateWorkspaceUserRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
