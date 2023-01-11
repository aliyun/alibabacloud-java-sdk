// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mseap20210118.models;

import com.aliyun.tea.*;

public class CallbackTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CallbackTaskResponseBody body;

    public static CallbackTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CallbackTaskResponse self = new CallbackTaskResponse();
        return TeaModel.build(map, self);
    }

    public CallbackTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CallbackTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CallbackTaskResponse setBody(CallbackTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CallbackTaskResponseBody getBody() {
        return this.body;
    }

}
