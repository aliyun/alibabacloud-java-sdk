// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class AlterCatalogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AlterCatalogResponseBody body;

    public static AlterCatalogResponse build(java.util.Map<String, ?> map) throws Exception {
        AlterCatalogResponse self = new AlterCatalogResponse();
        return TeaModel.build(map, self);
    }

    public AlterCatalogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AlterCatalogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AlterCatalogResponse setBody(AlterCatalogResponseBody body) {
        this.body = body;
        return this;
    }
    public AlterCatalogResponseBody getBody() {
        return this.body;
    }

}
