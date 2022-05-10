// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class QueryBizLogByOpTypeAndTimeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryBizLogByOpTypeAndTimeResponseBody body;

    public static QueryBizLogByOpTypeAndTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBizLogByOpTypeAndTimeResponse self = new QueryBizLogByOpTypeAndTimeResponse();
        return TeaModel.build(map, self);
    }

    public QueryBizLogByOpTypeAndTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryBizLogByOpTypeAndTimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryBizLogByOpTypeAndTimeResponse setBody(QueryBizLogByOpTypeAndTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryBizLogByOpTypeAndTimeResponseBody getBody() {
        return this.body;
    }

}
