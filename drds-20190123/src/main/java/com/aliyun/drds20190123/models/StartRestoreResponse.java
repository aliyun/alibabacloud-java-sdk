// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class StartRestoreResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartRestoreResponseBody body;

    public static StartRestoreResponse build(java.util.Map<String, ?> map) throws Exception {
        StartRestoreResponse self = new StartRestoreResponse();
        return TeaModel.build(map, self);
    }

    public StartRestoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartRestoreResponse setBody(StartRestoreResponseBody body) {
        this.body = body;
        return this;
    }
    public StartRestoreResponseBody getBody() {
        return this.body;
    }

}
