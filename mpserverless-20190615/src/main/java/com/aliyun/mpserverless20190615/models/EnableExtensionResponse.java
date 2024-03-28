// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class EnableExtensionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public EnableExtensionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableExtensionResponse setBody(EnableExtensionResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableExtensionResponseBody getBody() {
        return this.body;
    }

}
