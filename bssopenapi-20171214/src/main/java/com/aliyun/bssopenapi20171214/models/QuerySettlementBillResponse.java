// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QuerySettlementBillResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySettlementBillResponseBody body;

    public static QuerySettlementBillResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySettlementBillResponse self = new QuerySettlementBillResponse();
        return TeaModel.build(map, self);
    }

    public QuerySettlementBillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySettlementBillResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySettlementBillResponse setBody(QuerySettlementBillResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySettlementBillResponseBody getBody() {
        return this.body;
    }

}
