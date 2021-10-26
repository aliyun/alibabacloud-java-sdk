// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateFcServiceLinkedRoleRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    public static CreateFcServiceLinkedRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFcServiceLinkedRoleRequest self = new CreateFcServiceLinkedRoleRequest();
        return TeaModel.build(map, self);
    }

    public CreateFcServiceLinkedRoleRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
