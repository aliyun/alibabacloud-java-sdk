// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class DetachDbfsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DetachDbfsResponseBody body;

    public static DetachDbfsResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachDbfsResponse self = new DetachDbfsResponse();
        return TeaModel.build(map, self);
    }

    public DetachDbfsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachDbfsResponse setBody(DetachDbfsResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachDbfsResponseBody getBody() {
        return this.body;
    }

}
