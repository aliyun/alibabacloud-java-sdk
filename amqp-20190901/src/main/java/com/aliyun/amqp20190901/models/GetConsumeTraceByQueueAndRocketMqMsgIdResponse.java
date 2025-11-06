// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class GetConsumeTraceByQueueAndRocketMqMsgIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetConsumeTraceByQueueAndRocketMqMsgIdResponseBody body;

    public static GetConsumeTraceByQueueAndRocketMqMsgIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConsumeTraceByQueueAndRocketMqMsgIdResponse self = new GetConsumeTraceByQueueAndRocketMqMsgIdResponse();
        return TeaModel.build(map, self);
    }

    public GetConsumeTraceByQueueAndRocketMqMsgIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetConsumeTraceByQueueAndRocketMqMsgIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetConsumeTraceByQueueAndRocketMqMsgIdResponse setBody(GetConsumeTraceByQueueAndRocketMqMsgIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetConsumeTraceByQueueAndRocketMqMsgIdResponseBody getBody() {
        return this.body;
    }

}
