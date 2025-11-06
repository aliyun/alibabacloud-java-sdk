// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class GetSendTraceByQueueResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSendTraceByQueueResponseBody body;

    public static GetSendTraceByQueueResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSendTraceByQueueResponse self = new GetSendTraceByQueueResponse();
        return TeaModel.build(map, self);
    }

    public GetSendTraceByQueueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSendTraceByQueueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSendTraceByQueueResponse setBody(GetSendTraceByQueueResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSendTraceByQueueResponseBody getBody() {
        return this.body;
    }

}
