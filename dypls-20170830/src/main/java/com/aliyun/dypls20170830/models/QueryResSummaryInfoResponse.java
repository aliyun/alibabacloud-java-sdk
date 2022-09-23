// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class QueryResSummaryInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryResSummaryInfoResponseBody body;

    public static QueryResSummaryInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryResSummaryInfoResponse self = new QueryResSummaryInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryResSummaryInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryResSummaryInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryResSummaryInfoResponse setBody(QueryResSummaryInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryResSummaryInfoResponseBody getBody() {
        return this.body;
    }

}
