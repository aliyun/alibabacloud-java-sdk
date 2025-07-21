// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateConsumerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateConsumerResponseBody body;

    public static UpdateConsumerResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateConsumerResponse self = new UpdateConsumerResponse();
        return TeaModel.build(map, self);
    }

    public UpdateConsumerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateConsumerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateConsumerResponse setBody(UpdateConsumerResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateConsumerResponseBody getBody() {
        return this.body;
    }

}
