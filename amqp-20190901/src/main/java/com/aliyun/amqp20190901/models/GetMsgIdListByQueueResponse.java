// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class GetMsgIdListByQueueResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMsgIdListByQueueResponseBody body;

    public static GetMsgIdListByQueueResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMsgIdListByQueueResponse self = new GetMsgIdListByQueueResponse();
        return TeaModel.build(map, self);
    }

    public GetMsgIdListByQueueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMsgIdListByQueueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMsgIdListByQueueResponse setBody(GetMsgIdListByQueueResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMsgIdListByQueueResponseBody getBody() {
        return this.body;
    }

}
