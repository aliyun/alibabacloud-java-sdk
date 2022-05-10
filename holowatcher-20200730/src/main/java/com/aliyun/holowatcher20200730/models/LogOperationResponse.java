// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class LogOperationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public LogOperationResponseBody body;

    public static LogOperationResponse build(java.util.Map<String, ?> map) throws Exception {
        LogOperationResponse self = new LogOperationResponse();
        return TeaModel.build(map, self);
    }

    public LogOperationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LogOperationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LogOperationResponse setBody(LogOperationResponseBody body) {
        this.body = body;
        return this;
    }
    public LogOperationResponseBody getBody() {
        return this.body;
    }

}
