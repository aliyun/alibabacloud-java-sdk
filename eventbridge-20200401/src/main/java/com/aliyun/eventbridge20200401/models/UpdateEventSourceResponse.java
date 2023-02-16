// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class UpdateEventSourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateEventSourceResponseBody body;

    public static UpdateEventSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEventSourceResponse self = new UpdateEventSourceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEventSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEventSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateEventSourceResponse setBody(UpdateEventSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEventSourceResponseBody getBody() {
        return this.body;
    }

}
