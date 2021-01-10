// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class CheckServiceLinkedRoleRequest extends TeaModel {
    @NameInMap("RoleName")
    public String roleName;

    public static CheckServiceLinkedRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckServiceLinkedRoleRequest self = new CheckServiceLinkedRoleRequest();
        return TeaModel.build(map, self);
    }

    public CheckServiceLinkedRoleRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

}
