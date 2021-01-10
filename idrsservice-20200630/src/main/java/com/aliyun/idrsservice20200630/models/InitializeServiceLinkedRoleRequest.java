// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class InitializeServiceLinkedRoleRequest extends TeaModel {
    @NameInMap("RoleName")
    public String roleName;

    public static InitializeServiceLinkedRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        InitializeServiceLinkedRoleRequest self = new InitializeServiceLinkedRoleRequest();
        return TeaModel.build(map, self);
    }

    public InitializeServiceLinkedRoleRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

}
