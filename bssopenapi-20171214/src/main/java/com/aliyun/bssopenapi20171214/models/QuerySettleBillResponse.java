// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QuerySettleBillResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QuerySettleBillResponse setBody(QuerySettleBillResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySettleBillResponseBody getBody() {
        return this.body;
    }

}
