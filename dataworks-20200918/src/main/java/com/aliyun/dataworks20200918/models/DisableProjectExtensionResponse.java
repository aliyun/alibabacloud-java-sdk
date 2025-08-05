// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class DisableProjectExtensionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableProjectExtensionResponseBody body;

    public static DisableProjectExtensionResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableProjectExtensionResponse self = new DisableProjectExtensionResponse();
        return TeaModel.build(map, self);
    }

    public DisableProjectExtensionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableProjectExtensionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableProjectExtensionResponse setBody(DisableProjectExtensionResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableProjectExtensionResponseBody getBody() {
        return this.body;
    }

}
