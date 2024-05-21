// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class AddEmployeesToCustomRoleShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("role_id")
    public String roleId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("user_id_list")
    public String userIdListShrink;

    public static AddEmployeesToCustomRoleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddEmployeesToCustomRoleShrinkRequest self = new AddEmployeesToCustomRoleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddEmployeesToCustomRoleShrinkRequest setRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }
    public String getRoleId() {
        return this.roleId;
    }

    public AddEmployeesToCustomRoleShrinkRequest setUserIdListShrink(String userIdListShrink) {
        this.userIdListShrink = userIdListShrink;
        return this;
    }
    public String getUserIdListShrink() {
        return this.userIdListShrink;
    }

}
