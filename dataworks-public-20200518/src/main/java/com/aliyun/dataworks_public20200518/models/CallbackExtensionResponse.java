// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CallbackExtensionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CallbackExtensionResponseBody body;

    public static CallbackExtensionResponse build(java.util.Map<String, ?> map) throws Exception {
        CallbackExtensionResponse self = new CallbackExtensionResponse();
        return TeaModel.build(map, self);
    }

    public CallbackExtensionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CallbackExtensionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CallbackExtensionResponse setBody(CallbackExtensionResponseBody body) {
        this.body = body;
        return this;
    }
    public CallbackExtensionResponseBody getBody() {
        return this.body;
    }

}
