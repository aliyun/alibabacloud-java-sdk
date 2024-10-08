// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateScheduledPreloadExecutionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateScheduledPreloadExecutionResponseBody body;

    public static UpdateScheduledPreloadExecutionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateScheduledPreloadExecutionResponse self = new UpdateScheduledPreloadExecutionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateScheduledPreloadExecutionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateScheduledPreloadExecutionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateScheduledPreloadExecutionResponse setBody(UpdateScheduledPreloadExecutionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateScheduledPreloadExecutionResponseBody getBody() {
        return this.body;
    }

}
