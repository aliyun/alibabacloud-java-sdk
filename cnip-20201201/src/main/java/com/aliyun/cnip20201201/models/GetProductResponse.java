// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class GetProductResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetProductResponseBody body;

    public static GetProductResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProductResponse self = new GetProductResponse();
        return TeaModel.build(map, self);
    }

    public GetProductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProductResponse setBody(GetProductResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProductResponseBody getBody() {
        return this.body;
    }

}
