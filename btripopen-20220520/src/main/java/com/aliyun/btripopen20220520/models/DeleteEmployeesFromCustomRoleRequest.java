// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class DeleteEmployeesFromCustomRoleRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("role_id")
    public String roleId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("user_id_list")
    public java.util.List<String> userIdList;

    public static DeleteEmployeesFromCustomRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEmployeesFromCustomRoleRequest self = new DeleteEmployeesFromCustomRoleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEmployeesFromCustomRoleRequest setRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }
    public String getRoleId() {
        return this.roleId;
    }

    public DeleteEmployeesFromCustomRoleRequest setUserIdList(java.util.List<String> userIdList) {
        this.userIdList = userIdList;
        return this;
    }
    public java.util.List<String> getUserIdList() {
        return this.userIdList;
    }

}
