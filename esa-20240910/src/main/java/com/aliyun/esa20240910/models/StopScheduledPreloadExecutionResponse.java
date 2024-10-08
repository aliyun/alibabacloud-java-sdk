// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class StopScheduledPreloadExecutionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopScheduledPreloadExecutionResponseBody body;

    public static StopScheduledPreloadExecutionResponse build(java.util.Map<String, ?> map) throws Exception {
        StopScheduledPreloadExecutionResponse self = new StopScheduledPreloadExecutionResponse();
        return TeaModel.build(map, self);
    }

    public StopScheduledPreloadExecutionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopScheduledPreloadExecutionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopScheduledPreloadExecutionResponse setBody(StopScheduledPreloadExecutionResponseBody body) {
        this.body = body;
        return this;
    }
    public StopScheduledPreloadExecutionResponseBody getBody() {
        return this.body;
    }

}
