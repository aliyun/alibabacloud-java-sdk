// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class UpdateQueueConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateQueueConfigResponseBody body;

    public static UpdateQueueConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateQueueConfigResponse self = new UpdateQueueConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateQueueConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateQueueConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateQueueConfigResponse setBody(UpdateQueueConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateQueueConfigResponseBody getBody() {
        return this.body;
    }

}
