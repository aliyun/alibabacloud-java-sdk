// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryWithholdTradeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryWithholdTradeResponseBody body;

    public static QueryWithholdTradeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryWithholdTradeResponse self = new QueryWithholdTradeResponse();
        return TeaModel.build(map, self);
    }

    public QueryWithholdTradeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryWithholdTradeResponse setBody(QueryWithholdTradeResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryWithholdTradeResponseBody getBody() {
        return this.body;
    }

}
