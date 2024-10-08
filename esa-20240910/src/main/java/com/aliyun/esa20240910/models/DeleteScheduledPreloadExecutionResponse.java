// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteScheduledPreloadExecutionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteScheduledPreloadExecutionResponseBody body;

    public static DeleteScheduledPreloadExecutionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteScheduledPreloadExecutionResponse self = new DeleteScheduledPreloadExecutionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteScheduledPreloadExecutionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteScheduledPreloadExecutionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteScheduledPreloadExecutionResponse setBody(DeleteScheduledPreloadExecutionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteScheduledPreloadExecutionResponseBody getBody() {
        return this.body;
    }

}
