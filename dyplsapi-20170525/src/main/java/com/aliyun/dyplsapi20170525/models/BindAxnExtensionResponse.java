// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class BindAxnExtensionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BindAxnExtensionResponseBody body;

    public static BindAxnExtensionResponse build(java.util.Map<String, ?> map) throws Exception {
        BindAxnExtensionResponse self = new BindAxnExtensionResponse();
        return TeaModel.build(map, self);
    }

    public BindAxnExtensionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindAxnExtensionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindAxnExtensionResponse setBody(BindAxnExtensionResponseBody body) {
        this.body = body;
        return this;
    }
    public BindAxnExtensionResponseBody getBody() {
        return this.body;
    }

}
