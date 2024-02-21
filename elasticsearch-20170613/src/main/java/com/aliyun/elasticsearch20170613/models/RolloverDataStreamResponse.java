// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class RolloverDataStreamResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RolloverDataStreamResponseBody body;

    public static RolloverDataStreamResponse build(java.util.Map<String, ?> map) throws Exception {
        RolloverDataStreamResponse self = new RolloverDataStreamResponse();
        return TeaModel.build(map, self);
    }

    public RolloverDataStreamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RolloverDataStreamResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RolloverDataStreamResponse setBody(RolloverDataStreamResponseBody body) {
        this.body = body;
        return this;
    }
    public RolloverDataStreamResponseBody getBody() {
        return this.body;
    }

}
