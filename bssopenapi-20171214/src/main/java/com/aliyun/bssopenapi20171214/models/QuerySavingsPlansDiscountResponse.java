// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QuerySavingsPlansDiscountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySavingsPlansDiscountResponseBody body;

    public static QuerySavingsPlansDiscountResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySavingsPlansDiscountResponse self = new QuerySavingsPlansDiscountResponse();
        return TeaModel.build(map, self);
    }

    public QuerySavingsPlansDiscountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySavingsPlansDiscountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySavingsPlansDiscountResponse setBody(QuerySavingsPlansDiscountResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySavingsPlansDiscountResponseBody getBody() {
        return this.body;
    }

}
