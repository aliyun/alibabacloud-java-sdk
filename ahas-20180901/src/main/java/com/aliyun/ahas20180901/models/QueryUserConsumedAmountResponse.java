// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryUserConsumedAmountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryUserConsumedAmountResponseBody body;

    public static QueryUserConsumedAmountResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUserConsumedAmountResponse self = new QueryUserConsumedAmountResponse();
        return TeaModel.build(map, self);
    }

    public QueryUserConsumedAmountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryUserConsumedAmountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryUserConsumedAmountResponse setBody(QueryUserConsumedAmountResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryUserConsumedAmountResponseBody getBody() {
        return this.body;
    }

}
