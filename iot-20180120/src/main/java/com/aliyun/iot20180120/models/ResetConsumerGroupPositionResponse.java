// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ResetConsumerGroupPositionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ResetConsumerGroupPositionResponse setBody(ResetConsumerGroupPositionResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetConsumerGroupPositionResponseBody getBody() {
        return this.body;
    }

}
