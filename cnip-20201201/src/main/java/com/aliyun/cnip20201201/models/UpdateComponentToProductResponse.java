// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class UpdateComponentToProductResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateComponentToProductResponseBody body;

    public static UpdateComponentToProductResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateComponentToProductResponse self = new UpdateComponentToProductResponse();
        return TeaModel.build(map, self);
    }

    public UpdateComponentToProductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateComponentToProductResponse setBody(UpdateComponentToProductResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateComponentToProductResponseBody getBody() {
        return this.body;
    }

}
