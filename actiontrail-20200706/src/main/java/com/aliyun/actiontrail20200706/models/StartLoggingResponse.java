// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class StartLoggingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartLoggingResponseBody body;

    public static StartLoggingResponse build(java.util.Map<String, ?> map) throws Exception {
        StartLoggingResponse self = new StartLoggingResponse();
        return TeaModel.build(map, self);
    }

    public StartLoggingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartLoggingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartLoggingResponse setBody(StartLoggingResponseBody body) {
        this.body = body;
        return this;
    }
    public StartLoggingResponseBody getBody() {
        return this.body;
    }

}
