// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class EnableProjectExtensionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableProjectExtensionResponseBody body;

    public static EnableProjectExtensionResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableProjectExtensionResponse self = new EnableProjectExtensionResponse();
        return TeaModel.build(map, self);
    }

    public EnableProjectExtensionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableProjectExtensionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableProjectExtensionResponse setBody(EnableProjectExtensionResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableProjectExtensionResponseBody getBody() {
        return this.body;
    }

}
