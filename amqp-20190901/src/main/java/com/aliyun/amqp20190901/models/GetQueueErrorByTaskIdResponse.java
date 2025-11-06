// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class GetQueueErrorByTaskIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetQueueErrorByTaskIdResponseBody body;

    public static GetQueueErrorByTaskIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQueueErrorByTaskIdResponse self = new GetQueueErrorByTaskIdResponse();
        return TeaModel.build(map, self);
    }

    public GetQueueErrorByTaskIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQueueErrorByTaskIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetQueueErrorByTaskIdResponse setBody(GetQueueErrorByTaskIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQueueErrorByTaskIdResponseBody getBody() {
        return this.body;
    }

}
