// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class StartScheduledPreloadExecutionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartScheduledPreloadExecutionResponseBody body;

    public static StartScheduledPreloadExecutionResponse build(java.util.Map<String, ?> map) throws Exception {
        StartScheduledPreloadExecutionResponse self = new StartScheduledPreloadExecutionResponse();
        return TeaModel.build(map, self);
    }

    public StartScheduledPreloadExecutionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartScheduledPreloadExecutionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartScheduledPreloadExecutionResponse setBody(StartScheduledPreloadExecutionResponseBody body) {
        this.body = body;
        return this;
    }
    public StartScheduledPreloadExecutionResponseBody getBody() {
        return this.body;
    }

}
