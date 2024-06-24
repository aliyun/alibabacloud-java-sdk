// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class AddEmployeesToCustomRoleRequest extends TeaModel {
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
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("user_id_list")
    public java.util.List<String> userIdList;

    public static AddEmployeesToCustomRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        AddEmployeesToCustomRoleRequest self = new AddEmployeesToCustomRoleRequest();
        return TeaModel.build(map, self);
    }

    public AddEmployeesToCustomRoleRequest setRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }
    public String getRoleId() {
        return this.roleId;
    }

    public AddEmployeesToCustomRoleRequest setUserIdList(java.util.List<String> userIdList) {
        this.userIdList = userIdList;
        return this;
    }
    public java.util.List<String> getUserIdList() {
        return this.userIdList;
    }

}
