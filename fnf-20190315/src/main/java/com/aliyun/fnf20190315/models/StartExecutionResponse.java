// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class StartExecutionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StartExecutionResponseBody body;

    public static StartExecutionResponse build(java.util.Map<String, ?> map) throws Exception {
        StartExecutionResponse self = new StartExecutionResponse();
        return TeaModel.build(map, self);
    }

    public StartExecutionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartExecutionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartExecutionResponse setBody(StartExecutionResponseBody body) {
        this.body = body;
        return this;
    }
    public StartExecutionResponseBody getBody() {
        return this.body;
    }

}
