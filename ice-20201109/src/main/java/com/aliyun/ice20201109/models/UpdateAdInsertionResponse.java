// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateAdInsertionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAdInsertionResponseBody body;

    public static UpdateAdInsertionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAdInsertionResponse self = new UpdateAdInsertionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAdInsertionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAdInsertionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAdInsertionResponse setBody(UpdateAdInsertionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAdInsertionResponseBody getBody() {
        return this.body;
    }

}
