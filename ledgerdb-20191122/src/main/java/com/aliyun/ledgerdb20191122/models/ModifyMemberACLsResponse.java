// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class ModifyMemberACLsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyMemberACLsResponseBody body;

    public static ModifyMemberACLsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyMemberACLsResponse self = new ModifyMemberACLsResponse();
        return TeaModel.build(map, self);
    }

    public ModifyMemberACLsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyMemberACLsResponse setBody(ModifyMemberACLsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyMemberACLsResponseBody getBody() {
        return this.body;
    }

}
