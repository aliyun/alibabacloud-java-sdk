// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class AuthorizeProductVersionRequest extends TeaModel {
    // 被授权者uid
    @NameInMap("grantee")
    public String grantee;

    public static AuthorizeProductVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeProductVersionRequest self = new AuthorizeProductVersionRequest();
        return TeaModel.build(map, self);
    }

    public AuthorizeProductVersionRequest setGrantee(String grantee) {
        this.grantee = grantee;
        return this;
    }
    public String getGrantee() {
        return this.grantee;
    }

}
