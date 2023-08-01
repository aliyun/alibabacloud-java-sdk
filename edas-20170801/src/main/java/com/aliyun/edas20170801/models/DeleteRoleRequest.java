// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeleteRoleRequest extends TeaModel {
    /**
     * <p>The ID of the RAM role.</p>
     */
    @NameInMap("RoleId")
    public Integer roleId;

    public static DeleteRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRoleRequest self = new DeleteRoleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRoleRequest setRoleId(Integer roleId) {
        this.roleId = roleId;
        return this;
    }
    public Integer getRoleId() {
        return this.roleId;
    }

}
