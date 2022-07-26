// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class UpdateCatalogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateCatalogResponseBody body;

    public static UpdateCatalogResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCatalogResponse self = new UpdateCatalogResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCatalogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCatalogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCatalogResponse setBody(UpdateCatalogResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCatalogResponseBody getBody() {
        return this.body;
    }

}
