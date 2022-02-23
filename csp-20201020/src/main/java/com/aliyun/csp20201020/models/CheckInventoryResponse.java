// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class CheckInventoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckInventoryResponseBody body;

    public static CheckInventoryResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckInventoryResponse self = new CheckInventoryResponse();
        return TeaModel.build(map, self);
    }

    public CheckInventoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckInventoryResponse setBody(CheckInventoryResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckInventoryResponseBody getBody() {
        return this.body;
    }

}
