// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ResetConsumerGroupPositionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetConsumerGroupPositionResponseBody body;

    public static ResetConsumerGroupPositionResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetConsumerGroupPositionResponse self = new ResetConsumerGroupPositionResponse();
        return TeaModel.build(map, self);
    }

    public ResetConsumerGroupPositionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetConsumerGroupPositionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetConsumerGroupPositionResponse setBody(ResetConsumerGroupPositionResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetConsumerGroupPositionResponseBody getBody() {
        return this.body;
    }

}
