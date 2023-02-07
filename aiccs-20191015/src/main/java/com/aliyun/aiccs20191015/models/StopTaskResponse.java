// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class StopTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StopTaskResponseBody body;

    public static StopTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StopTaskResponse self = new StopTaskResponse();
        return TeaModel.build(map, self);
    }

    public StopTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopTaskResponse setBody(StopTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StopTaskResponseBody getBody() {
        return this.body;
    }

}
