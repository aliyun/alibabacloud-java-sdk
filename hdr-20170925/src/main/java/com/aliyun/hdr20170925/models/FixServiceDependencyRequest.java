// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class FixServiceDependencyRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    public static FixServiceDependencyRequest build(java.util.Map<String, ?> map) throws Exception {
        FixServiceDependencyRequest self = new FixServiceDependencyRequest();
        return TeaModel.build(map, self);
    }

    public FixServiceDependencyRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
