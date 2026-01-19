// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcallcenter20200701.models;

import com.aliyun.tea.*;

public class ProcessCustomIMCallbackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ProcessCustomIMCallbackResponseBody body;

    public static ProcessCustomIMCallbackResponse build(java.util.Map<String, ?> map) throws Exception {
        ProcessCustomIMCallbackResponse self = new ProcessCustomIMCallbackResponse();
        return TeaModel.build(map, self);
    }

    public ProcessCustomIMCallbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ProcessCustomIMCallbackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ProcessCustomIMCallbackResponse setBody(ProcessCustomIMCallbackResponseBody body) {
        this.body = body;
        return this;
    }
    public ProcessCustomIMCallbackResponseBody getBody() {
        return this.body;
    }

}
