// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetFoundationVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetFoundationVersionResponseBody body;

    public static GetFoundationVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFoundationVersionResponse self = new GetFoundationVersionResponse();
        return TeaModel.build(map, self);
    }

    public GetFoundationVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFoundationVersionResponse setBody(GetFoundationVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFoundationVersionResponseBody getBody() {
        return this.body;
    }

}
