// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyiotapi20171111.models;

import com.aliyun.tea.*;

public class QueryCardsInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryCardsInfoResponseBody body;

    public static QueryCardsInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCardsInfoResponse self = new QueryCardsInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryCardsInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCardsInfoResponse setBody(QueryCardsInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCardsInfoResponseBody getBody() {
        return this.body;
    }

}
