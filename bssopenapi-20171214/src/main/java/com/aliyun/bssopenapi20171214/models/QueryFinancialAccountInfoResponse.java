// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryFinancialAccountInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryFinancialAccountInfoResponseBody body;

    public static QueryFinancialAccountInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFinancialAccountInfoResponse self = new QueryFinancialAccountInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryFinancialAccountInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryFinancialAccountInfoResponse setBody(QueryFinancialAccountInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryFinancialAccountInfoResponseBody getBody() {
        return this.body;
    }

}
