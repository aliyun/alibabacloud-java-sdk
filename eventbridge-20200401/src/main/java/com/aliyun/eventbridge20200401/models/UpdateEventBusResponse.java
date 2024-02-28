// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class UpdateEventBusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateEventBusResponseBody body;

    public static UpdateEventBusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEventBusResponse self = new UpdateEventBusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEventBusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEventBusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateEventBusResponse setBody(UpdateEventBusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEventBusResponseBody getBody() {
        return this.body;
    }

}
