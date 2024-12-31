// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bss20140714.models;

import com.aliyun.tea.*;

public class OpenCallbackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OpenCallbackResponseBody body;

    public static OpenCallbackResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenCallbackResponse self = new OpenCallbackResponse();
        return TeaModel.build(map, self);
    }

    public OpenCallbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenCallbackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenCallbackResponse setBody(OpenCallbackResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenCallbackResponseBody getBody() {
        return this.body;
    }

}
