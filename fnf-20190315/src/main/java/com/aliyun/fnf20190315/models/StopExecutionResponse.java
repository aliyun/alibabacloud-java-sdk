// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class StopExecutionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StopExecutionResponseBody body;

    public static StopExecutionResponse build(java.util.Map<String, ?> map) throws Exception {
        StopExecutionResponse self = new StopExecutionResponse();
        return TeaModel.build(map, self);
    }

    public StopExecutionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopExecutionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopExecutionResponse setBody(StopExecutionResponseBody body) {
        this.body = body;
        return this;
    }
    public StopExecutionResponseBody getBody() {
        return this.body;
    }

}
