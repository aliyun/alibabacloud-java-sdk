// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class UpdateProductVersionConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateProductVersionConfigResponseBody body;

    public static UpdateProductVersionConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateProductVersionConfigResponse self = new UpdateProductVersionConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateProductVersionConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateProductVersionConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateProductVersionConfigResponse setBody(UpdateProductVersionConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateProductVersionConfigResponseBody getBody() {
        return this.body;
    }

}
