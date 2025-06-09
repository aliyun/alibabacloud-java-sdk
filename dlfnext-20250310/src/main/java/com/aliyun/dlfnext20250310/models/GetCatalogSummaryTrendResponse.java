// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class GetCatalogSummaryTrendResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CatalogSummaryTrend body;

    public static GetCatalogSummaryTrendResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCatalogSummaryTrendResponse self = new GetCatalogSummaryTrendResponse();
        return TeaModel.build(map, self);
    }

    public GetCatalogSummaryTrendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCatalogSummaryTrendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCatalogSummaryTrendResponse setBody(CatalogSummaryTrend body) {
        this.body = body;
        return this;
    }
    public CatalogSummaryTrend getBody() {
        return this.body;
    }

}
