// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class UpdateModelApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateModelApplicationResponseBody body;

    public static UpdateModelApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelApplicationResponse self = new UpdateModelApplicationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateModelApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateModelApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateModelApplicationResponse setBody(UpdateModelApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateModelApplicationResponseBody getBody() {
        return this.body;
    }

}
