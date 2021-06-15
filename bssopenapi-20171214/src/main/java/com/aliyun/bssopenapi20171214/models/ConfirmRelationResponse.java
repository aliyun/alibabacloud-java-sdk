// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class ConfirmRelationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ConfirmRelationResponseBody body;

    public static ConfirmRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfirmRelationResponse self = new ConfirmRelationResponse();
        return TeaModel.build(map, self);
    }

    public ConfirmRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfirmRelationResponse setBody(ConfirmRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfirmRelationResponseBody getBody() {
        return this.body;
    }

}
