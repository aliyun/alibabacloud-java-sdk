// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class QueryHBaseHaDBResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHBaseHaDBResponseBody body;

    public static QueryHBaseHaDBResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHBaseHaDBResponse self = new QueryHBaseHaDBResponse();
        return TeaModel.build(map, self);
    }

    public QueryHBaseHaDBResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHBaseHaDBResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryHBaseHaDBResponse setBody(QueryHBaseHaDBResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHBaseHaDBResponseBody getBody() {
        return this.body;
    }

}
