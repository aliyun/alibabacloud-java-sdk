// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class CheckServiceHealthResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckServiceHealthResponseBody body;

    public static CheckServiceHealthResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckServiceHealthResponse self = new CheckServiceHealthResponse();
        return TeaModel.build(map, self);
    }

    public CheckServiceHealthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckServiceHealthResponse setBody(CheckServiceHealthResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckServiceHealthResponseBody getBody() {
        return this.body;
    }

}
