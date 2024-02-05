// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateStatusResponseBody body;

    public static UpdateStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateStatusResponse self = new UpdateStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateStatusResponse setBody(UpdateStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateStatusResponseBody getBody() {
        return this.body;
    }

}
