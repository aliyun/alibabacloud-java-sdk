// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class GetProductEnvironmentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetProductEnvironmentResponseBody body;

    public static GetProductEnvironmentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProductEnvironmentResponse self = new GetProductEnvironmentResponse();
        return TeaModel.build(map, self);
    }

    public GetProductEnvironmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProductEnvironmentResponse setBody(GetProductEnvironmentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProductEnvironmentResponseBody getBody() {
        return this.body;
    }

}
