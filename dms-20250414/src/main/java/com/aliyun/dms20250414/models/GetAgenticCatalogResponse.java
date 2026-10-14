// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetAgenticCatalogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAgenticCatalogResponseBody body;

    public static GetAgenticCatalogResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgenticCatalogResponse self = new GetAgenticCatalogResponse();
        return TeaModel.build(map, self);
    }

    public GetAgenticCatalogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgenticCatalogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAgenticCatalogResponse setBody(GetAgenticCatalogResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgenticCatalogResponseBody getBody() {
        return this.body;
    }

}
