// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class GetSendTraceByMsgIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSendTraceByMsgIdResponseBody body;

    public static GetSendTraceByMsgIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSendTraceByMsgIdResponse self = new GetSendTraceByMsgIdResponse();
        return TeaModel.build(map, self);
    }

    public GetSendTraceByMsgIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSendTraceByMsgIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSendTraceByMsgIdResponse setBody(GetSendTraceByMsgIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSendTraceByMsgIdResponseBody getBody() {
        return this.body;
    }

}
