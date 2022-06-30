// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DisableWebCCResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DisableWebCCResponseBody body;

    public static DisableWebCCResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableWebCCResponse self = new DisableWebCCResponse();
        return TeaModel.build(map, self);
    }

    public DisableWebCCResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableWebCCResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableWebCCResponse setBody(DisableWebCCResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableWebCCResponseBody getBody() {
        return this.body;
    }

}
