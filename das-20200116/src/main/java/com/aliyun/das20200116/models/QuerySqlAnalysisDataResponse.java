// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class QuerySqlAnalysisDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySqlAnalysisDataResponseBody body;

    public static QuerySqlAnalysisDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySqlAnalysisDataResponse self = new QuerySqlAnalysisDataResponse();
        return TeaModel.build(map, self);
    }

    public QuerySqlAnalysisDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySqlAnalysisDataResponse setBody(QuerySqlAnalysisDataResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySqlAnalysisDataResponseBody getBody() {
        return this.body;
    }

}
