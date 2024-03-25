// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class BackendCallSignalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BackendCallSignalResponseBody body;

    public static BackendCallSignalResponse build(java.util.Map<String, ?> map) throws Exception {
        BackendCallSignalResponse self = new BackendCallSignalResponse();
        return TeaModel.build(map, self);
    }

    public BackendCallSignalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BackendCallSignalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BackendCallSignalResponse setBody(BackendCallSignalResponseBody body) {
        this.body = body;
        return this;
    }
    public BackendCallSignalResponseBody getBody() {
        return this.body;
    }

}
