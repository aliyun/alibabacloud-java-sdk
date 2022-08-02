// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetCatalogSummaryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetCatalogSummaryResponseBody body;

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

    public GetCatalogSummaryResponse setBody(GetCatalogSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCatalogSummaryResponseBody getBody() {
        return this.body;
    }

}
