// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CheckFcServiceLinkedRoleRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    public static CheckFcServiceLinkedRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckFcServiceLinkedRoleRequest self = new CheckFcServiceLinkedRoleRequest();
        return TeaModel.build(map, self);
    }

    public CheckFcServiceLinkedRoleRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
