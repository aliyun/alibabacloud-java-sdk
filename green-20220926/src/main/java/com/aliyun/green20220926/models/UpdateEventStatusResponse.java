// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class UpdateEventStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateEventStatusResponseBody body;

    public static UpdateEventStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEventStatusResponse self = new UpdateEventStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEventStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEventStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateEventStatusResponse setBody(UpdateEventStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEventStatusResponseBody getBody() {
        return this.body;
    }

}
