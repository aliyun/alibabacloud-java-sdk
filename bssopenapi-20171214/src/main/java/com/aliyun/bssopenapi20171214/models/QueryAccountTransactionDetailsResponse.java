// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryAccountTransactionDetailsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAccountTransactionDetailsResponseBody body;

    public static QueryAccountTransactionDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAccountTransactionDetailsResponse self = new QueryAccountTransactionDetailsResponse();
        return TeaModel.build(map, self);
    }

    public QueryAccountTransactionDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAccountTransactionDetailsResponse setBody(QueryAccountTransactionDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAccountTransactionDetailsResponseBody getBody() {
        return this.body;
    }

}
