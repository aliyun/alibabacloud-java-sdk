// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class GetCatalogTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCatalogTokenResponseBody body;

    public static GetCatalogTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCatalogTokenResponse self = new GetCatalogTokenResponse();
        return TeaModel.build(map, self);
    }

    public GetCatalogTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCatalogTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCatalogTokenResponse setBody(GetCatalogTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCatalogTokenResponseBody getBody() {
        return this.body;
    }

}
