// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteCasterRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("CasterId")
    @Validation(required = true)
    public String casterId;

    public static DeleteCasterRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCasterRequest self = new DeleteCasterRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCasterRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DeleteCasterRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

}
