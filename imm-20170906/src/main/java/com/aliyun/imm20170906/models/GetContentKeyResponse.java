// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class GetContentKeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetContentKeyResponseBody body;

    public static GetContentKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetContentKeyResponse self = new GetContentKeyResponse();
        return TeaModel.build(map, self);
    }

    public GetContentKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetContentKeyResponse setBody(GetContentKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetContentKeyResponseBody getBody() {
        return this.body;
    }

}
