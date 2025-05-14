// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateMultiDimTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMultiDimTableResponseBody body;

    public static UpdateMultiDimTableResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMultiDimTableResponse self = new UpdateMultiDimTableResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMultiDimTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMultiDimTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMultiDimTableResponse setBody(UpdateMultiDimTableResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMultiDimTableResponseBody getBody() {
        return this.body;
    }

}
