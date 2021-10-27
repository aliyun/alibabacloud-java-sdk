// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CheckNewTableNameValidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckNewTableNameValidResponseBody body;

    public static CheckNewTableNameValidResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckNewTableNameValidResponse self = new CheckNewTableNameValidResponse();
        return TeaModel.build(map, self);
    }

    public CheckNewTableNameValidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckNewTableNameValidResponse setBody(CheckNewTableNameValidResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckNewTableNameValidResponseBody getBody() {
        return this.body;
    }

}
