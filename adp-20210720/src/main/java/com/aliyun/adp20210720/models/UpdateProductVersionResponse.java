// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class UpdateProductVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateProductVersionResponseBody body;

    public static UpdateProductVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateProductVersionResponse self = new UpdateProductVersionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateProductVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateProductVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateProductVersionResponse setBody(UpdateProductVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateProductVersionResponseBody getBody() {
        return this.body;
    }

}
