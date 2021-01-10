// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class EnableExtensionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableExtensionResponseBody body;

    public static EnableExtensionResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableExtensionResponse self = new EnableExtensionResponse();
        return TeaModel.build(map, self);
    }

    public EnableExtensionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableExtensionResponse setBody(EnableExtensionResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableExtensionResponseBody getBody() {
        return this.body;
    }

}
