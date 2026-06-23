// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class OpenEdgeContainerRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    public static OpenEdgeContainerRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenEdgeContainerRequest self = new OpenEdgeContainerRequest();
        return TeaModel.build(map, self);
    }

    public OpenEdgeContainerRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
