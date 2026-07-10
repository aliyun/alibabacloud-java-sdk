// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class DeleteCustomRoleRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("role_id")
    public String roleId;

    public static DeleteCustomRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomRoleRequest self = new DeleteCustomRoleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCustomRoleRequest setRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }
    public String getRoleId() {
        return this.roleId;
    }

}
