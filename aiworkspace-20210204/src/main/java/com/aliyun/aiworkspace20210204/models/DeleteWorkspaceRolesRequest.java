// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DeleteWorkspaceRolesRequest extends TeaModel {
    /**
     * <p>(Required) The list of role IDs.</p>
     */
    @NameInMap("RoleIds")
    public java.util.List<String> roleIds;

    public static DeleteWorkspaceRolesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkspaceRolesRequest self = new DeleteWorkspaceRolesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWorkspaceRolesRequest setRoleIds(java.util.List<String> roleIds) {
        this.roleIds = roleIds;
        return this;
    }
    public java.util.List<String> getRoleIds() {
        return this.roleIds;
    }

}
