// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class UpdateConsumerOffsetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateConsumerOffsetResponseBody body;

    public static UpdateConsumerOffsetResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateConsumerOffsetResponse self = new UpdateConsumerOffsetResponse();
        return TeaModel.build(map, self);
    }

    public UpdateConsumerOffsetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateConsumerOffsetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateConsumerOffsetResponse setBody(UpdateConsumerOffsetResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateConsumerOffsetResponseBody getBody() {
        return this.body;
    }

}
