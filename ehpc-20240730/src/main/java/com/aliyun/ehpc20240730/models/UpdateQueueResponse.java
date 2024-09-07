// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class UpdateQueueResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateQueueResponseBody body;

    public static UpdateQueueResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateQueueResponse self = new UpdateQueueResponse();
        return TeaModel.build(map, self);
    }

    public UpdateQueueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateQueueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateQueueResponse setBody(UpdateQueueResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateQueueResponseBody getBody() {
        return this.body;
    }

}
