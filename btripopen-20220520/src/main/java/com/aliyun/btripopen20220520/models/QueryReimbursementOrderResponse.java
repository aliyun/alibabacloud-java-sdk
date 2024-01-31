// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class QueryReimbursementOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryReimbursementOrderResponseBody body;

    public static QueryReimbursementOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryReimbursementOrderResponse self = new QueryReimbursementOrderResponse();
        return TeaModel.build(map, self);
    }

    public QueryReimbursementOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryReimbursementOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryReimbursementOrderResponse setBody(QueryReimbursementOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryReimbursementOrderResponseBody getBody() {
        return this.body;
    }

}
