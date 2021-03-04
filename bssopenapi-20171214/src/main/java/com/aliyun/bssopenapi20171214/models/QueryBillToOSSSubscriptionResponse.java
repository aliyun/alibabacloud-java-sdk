// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryBillToOSSSubscriptionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryBillToOSSSubscriptionResponseBody body;

    public static QueryBillToOSSSubscriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBillToOSSSubscriptionResponse self = new QueryBillToOSSSubscriptionResponse();
        return TeaModel.build(map, self);
    }

    public QueryBillToOSSSubscriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryBillToOSSSubscriptionResponse setBody(QueryBillToOSSSubscriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryBillToOSSSubscriptionResponseBody getBody() {
        return this.body;
    }

}
