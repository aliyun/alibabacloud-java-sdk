// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class QueryExportResUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryExportResUrlResponseBody body;

    public static QueryExportResUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryExportResUrlResponse self = new QueryExportResUrlResponse();
        return TeaModel.build(map, self);
    }

    public QueryExportResUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryExportResUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryExportResUrlResponse setBody(QueryExportResUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryExportResUrlResponseBody getBody() {
        return this.body;
    }

}
