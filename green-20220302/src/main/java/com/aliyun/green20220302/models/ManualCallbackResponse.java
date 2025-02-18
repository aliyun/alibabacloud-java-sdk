// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class ManualCallbackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ManualCallbackResponseBody body;

    public static ManualCallbackResponse build(java.util.Map<String, ?> map) throws Exception {
        ManualCallbackResponse self = new ManualCallbackResponse();
        return TeaModel.build(map, self);
    }

    public ManualCallbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ManualCallbackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ManualCallbackResponse setBody(ManualCallbackResponseBody body) {
        this.body = body;
        return this;
    }
    public ManualCallbackResponseBody getBody() {
        return this.body;
    }

}
