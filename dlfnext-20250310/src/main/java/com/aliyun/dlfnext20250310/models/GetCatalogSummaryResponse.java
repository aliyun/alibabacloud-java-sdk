// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class GetCatalogSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CatalogSummary body;

    public static GetCatalogSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCatalogSummaryResponse self = new GetCatalogSummaryResponse();
        return TeaModel.build(map, self);
    }

    public GetCatalogSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCatalogSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCatalogSummaryResponse setBody(CatalogSummary body) {
        this.body = body;
        return this;
    }
    public CatalogSummary getBody() {
        return this.body;
    }

}
