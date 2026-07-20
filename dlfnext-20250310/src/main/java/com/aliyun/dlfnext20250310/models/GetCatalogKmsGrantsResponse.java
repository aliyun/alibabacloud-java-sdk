// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class GetCatalogKmsGrantsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCatalogKmsGrantsResponseBody body;

    public static GetCatalogKmsGrantsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCatalogKmsGrantsResponse self = new GetCatalogKmsGrantsResponse();
        return TeaModel.build(map, self);
    }

    public GetCatalogKmsGrantsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCatalogKmsGrantsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCatalogKmsGrantsResponse setBody(GetCatalogKmsGrantsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCatalogKmsGrantsResponseBody getBody() {
        return this.body;
    }

}
