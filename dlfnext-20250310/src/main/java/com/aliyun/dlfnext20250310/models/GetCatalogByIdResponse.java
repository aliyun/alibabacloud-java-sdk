// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class GetCatalogByIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Catalog body;

    public static GetCatalogByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCatalogByIdResponse self = new GetCatalogByIdResponse();
        return TeaModel.build(map, self);
    }

    public GetCatalogByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCatalogByIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCatalogByIdResponse setBody(Catalog body) {
        this.body = body;
        return this;
    }
    public Catalog getBody() {
        return this.body;
    }

}
