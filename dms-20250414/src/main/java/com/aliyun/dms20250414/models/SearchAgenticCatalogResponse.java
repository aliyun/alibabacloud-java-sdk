// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class SearchAgenticCatalogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchAgenticCatalogResponseBody body;

    public static SearchAgenticCatalogResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchAgenticCatalogResponse self = new SearchAgenticCatalogResponse();
        return TeaModel.build(map, self);
    }

    public SearchAgenticCatalogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchAgenticCatalogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchAgenticCatalogResponse setBody(SearchAgenticCatalogResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchAgenticCatalogResponseBody getBody() {
        return this.body;
    }

}
