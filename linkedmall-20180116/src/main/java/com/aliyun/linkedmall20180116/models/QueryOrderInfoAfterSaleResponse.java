// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryOrderInfoAfterSaleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryOrderInfoAfterSaleResponseBody body;

    public static QueryOrderInfoAfterSaleResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderInfoAfterSaleResponse self = new QueryOrderInfoAfterSaleResponse();
        return TeaModel.build(map, self);
    }

    public QueryOrderInfoAfterSaleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryOrderInfoAfterSaleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryOrderInfoAfterSaleResponse setBody(QueryOrderInfoAfterSaleResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryOrderInfoAfterSaleResponseBody getBody() {
        return this.body;
    }

}
