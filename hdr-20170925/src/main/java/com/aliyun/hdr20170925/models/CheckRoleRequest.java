// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class CheckRoleRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    public static CheckRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckRoleRequest self = new CheckRoleRequest();
        return TeaModel.build(map, self);
    }

    public CheckRoleRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
