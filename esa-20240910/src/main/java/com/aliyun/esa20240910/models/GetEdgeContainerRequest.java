// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetEdgeContainerRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    public static GetEdgeContainerRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEdgeContainerRequest self = new GetEdgeContainerRequest();
        return TeaModel.build(map, self);
    }

    public GetEdgeContainerRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
