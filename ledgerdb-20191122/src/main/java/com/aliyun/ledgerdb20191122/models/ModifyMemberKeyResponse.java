// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class ModifyMemberKeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyMemberKeyResponseBody body;

    public static ModifyMemberKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyMemberKeyResponse self = new ModifyMemberKeyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyMemberKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyMemberKeyResponse setBody(ModifyMemberKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyMemberKeyResponseBody getBody() {
        return this.body;
    }

}
