// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class BatchStopGameSessionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BatchStopGameSessionsResponseBody body;

    public static BatchStopGameSessionsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchStopGameSessionsResponse self = new BatchStopGameSessionsResponse();
        return TeaModel.build(map, self);
    }

    public BatchStopGameSessionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchStopGameSessionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchStopGameSessionsResponse setBody(BatchStopGameSessionsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchStopGameSessionsResponseBody getBody() {
        return this.body;
    }

}
