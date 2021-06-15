// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class ModifyAccountRelationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyAccountRelationResponseBody body;

    public static ModifyAccountRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountRelationResponse self = new ModifyAccountRelationResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAccountRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAccountRelationResponse setBody(ModifyAccountRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAccountRelationResponseBody getBody() {
        return this.body;
    }

}
