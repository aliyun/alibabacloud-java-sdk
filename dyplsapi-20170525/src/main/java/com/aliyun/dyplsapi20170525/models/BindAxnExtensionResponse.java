// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class BindAxnExtensionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public BindAxnExtensionResponse setBody(BindAxnExtensionResponseBody body) {
        this.body = body;
        return this;
    }
    public BindAxnExtensionResponseBody getBody() {
        return this.body;
    }

}
