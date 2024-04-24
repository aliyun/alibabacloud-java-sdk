// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class StartRestoreResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public StartRestoreResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartRestoreResponse setBody(StartRestoreResponseBody body) {
        this.body = body;
        return this;
    }
    public StartRestoreResponseBody getBody() {
        return this.body;
    }

}
