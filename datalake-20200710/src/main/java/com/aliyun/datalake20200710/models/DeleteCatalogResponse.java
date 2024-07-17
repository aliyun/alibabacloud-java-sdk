// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class DeleteCatalogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCatalogResponseBody body;

    public static DeleteCatalogResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCatalogResponse self = new DeleteCatalogResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCatalogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCatalogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCatalogResponse setBody(DeleteCatalogResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCatalogResponseBody getBody() {
        return this.body;
    }

}
