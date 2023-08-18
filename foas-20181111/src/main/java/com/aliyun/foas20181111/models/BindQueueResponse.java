// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class BindQueueResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BindQueueResponseBody body;

    public static BindQueueResponse build(java.util.Map<String, ?> map) throws Exception {
        BindQueueResponse self = new BindQueueResponse();
        return TeaModel.build(map, self);
    }

    public BindQueueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindQueueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindQueueResponse setBody(BindQueueResponseBody body) {
        this.body = body;
        return this;
    }
    public BindQueueResponseBody getBody() {
        return this.body;
    }

}
