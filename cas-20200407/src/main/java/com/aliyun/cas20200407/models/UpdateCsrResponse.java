// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class UpdateCsrResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCsrResponseBody body;

    public static UpdateCsrResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCsrResponse self = new UpdateCsrResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCsrResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCsrResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCsrResponse setBody(UpdateCsrResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCsrResponseBody getBody() {
        return this.body;
    }

}
