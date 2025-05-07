// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class BindAxnExtensionFixedLineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BindAxnExtensionFixedLineResponseBody body;

    public static BindAxnExtensionFixedLineResponse build(java.util.Map<String, ?> map) throws Exception {
        BindAxnExtensionFixedLineResponse self = new BindAxnExtensionFixedLineResponse();
        return TeaModel.build(map, self);
    }

    public BindAxnExtensionFixedLineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindAxnExtensionFixedLineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindAxnExtensionFixedLineResponse setBody(BindAxnExtensionFixedLineResponseBody body) {
        this.body = body;
        return this;
    }
    public BindAxnExtensionFixedLineResponseBody getBody() {
        return this.body;
    }

}
