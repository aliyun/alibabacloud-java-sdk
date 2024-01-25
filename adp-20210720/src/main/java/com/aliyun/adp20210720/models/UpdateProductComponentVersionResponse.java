// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class UpdateProductComponentVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateProductComponentVersionResponseBody body;

    public static UpdateProductComponentVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateProductComponentVersionResponse self = new UpdateProductComponentVersionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateProductComponentVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateProductComponentVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateProductComponentVersionResponse setBody(UpdateProductComponentVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateProductComponentVersionResponseBody getBody() {
        return this.body;
    }

}
