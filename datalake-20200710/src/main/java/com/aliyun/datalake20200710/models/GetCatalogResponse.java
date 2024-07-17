// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetCatalogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCatalogResponseBody body;

    public static GetCatalogResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCatalogResponse self = new GetCatalogResponse();
        return TeaModel.build(map, self);
    }

    public GetCatalogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCatalogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCatalogResponse setBody(GetCatalogResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCatalogResponseBody getBody() {
        return this.body;
    }

}
