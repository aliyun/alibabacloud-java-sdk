// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CustomPrompt extends TeaModel {
    @NameInMap("RoleDefinition")
    public String roleDefinition;

    public static CustomPrompt build(java.util.Map<String, ?> map) throws Exception {
        CustomPrompt self = new CustomPrompt();
        return TeaModel.build(map, self);
    }

    public CustomPrompt setRoleDefinition(String roleDefinition) {
        this.roleDefinition = roleDefinition;
        return this;
    }
    public String getRoleDefinition() {
        return this.roleDefinition;
    }

}
