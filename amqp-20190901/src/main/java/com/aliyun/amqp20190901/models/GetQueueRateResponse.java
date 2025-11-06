// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class GetQueueRateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetQueueRateResponseBody body;

    public static GetQueueRateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQueueRateResponse self = new GetQueueRateResponse();
        return TeaModel.build(map, self);
    }

    public GetQueueRateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQueueRateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetQueueRateResponse setBody(GetQueueRateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQueueRateResponseBody getBody() {
        return this.body;
    }

}
