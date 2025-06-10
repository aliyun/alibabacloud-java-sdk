// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateConvExtensionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateConvExtensionResponseBody body;

    public static UpdateConvExtensionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateConvExtensionResponse self = new UpdateConvExtensionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateConvExtensionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateConvExtensionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateConvExtensionResponse setBody(UpdateConvExtensionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateConvExtensionResponseBody getBody() {
        return this.body;
    }

}
