// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class QuerySingleReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySingleReportResponseBody body;

    public static QuerySingleReportResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySingleReportResponse self = new QuerySingleReportResponse();
        return TeaModel.build(map, self);
    }

    public QuerySingleReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySingleReportResponse setBody(QuerySingleReportResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySingleReportResponseBody getBody() {
        return this.body;
    }

}
