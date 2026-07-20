// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class DeleteEmployeesFromCustomRoleShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("role_id")
    public String roleId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("user_id_list")
    public String userIdListShrink;

    public static DeleteEmployeesFromCustomRoleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEmployeesFromCustomRoleShrinkRequest self = new DeleteEmployeesFromCustomRoleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEmployeesFromCustomRoleShrinkRequest setRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }
    public String getRoleId() {
        return this.roleId;
    }

    public DeleteEmployeesFromCustomRoleShrinkRequest setUserIdListShrink(String userIdListShrink) {
        this.userIdListShrink = userIdListShrink;
        return this;
    }
    public String getUserIdListShrink() {
        return this.userIdListShrink;
    }

}
