// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QuerySettleBillResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySettleBillResponseBody body;

    public static QuerySettleBillResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySettleBillResponse self = new QuerySettleBillResponse();
        return TeaModel.build(map, self);
    }

    public QuerySettleBillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySettleBillResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySettleBillResponse setBody(QuerySettleBillResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySettleBillResponseBody getBody() {
        return this.body;
    }

}
