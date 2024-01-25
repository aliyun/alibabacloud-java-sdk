// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class UpdateProductFoundationVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateProductFoundationVersionResponseBody body;

    public static UpdateProductFoundationVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateProductFoundationVersionResponse self = new UpdateProductFoundationVersionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateProductFoundationVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateProductFoundationVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateProductFoundationVersionResponse setBody(UpdateProductFoundationVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateProductFoundationVersionResponseBody getBody() {
        return this.body;
    }

}
