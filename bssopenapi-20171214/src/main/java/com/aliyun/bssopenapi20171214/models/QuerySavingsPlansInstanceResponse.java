// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QuerySavingsPlansInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySavingsPlansInstanceResponseBody body;

    public static QuerySavingsPlansInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySavingsPlansInstanceResponse self = new QuerySavingsPlansInstanceResponse();
        return TeaModel.build(map, self);
    }

    public QuerySavingsPlansInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySavingsPlansInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySavingsPlansInstanceResponse setBody(QuerySavingsPlansInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySavingsPlansInstanceResponseBody getBody() {
        return this.body;
    }

}
