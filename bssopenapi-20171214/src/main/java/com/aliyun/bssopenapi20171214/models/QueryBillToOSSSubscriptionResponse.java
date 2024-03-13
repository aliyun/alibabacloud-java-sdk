// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryBillToOSSSubscriptionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public QueryBillToOSSSubscriptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryBillToOSSSubscriptionResponse setBody(QueryBillToOSSSubscriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryBillToOSSSubscriptionResponseBody getBody() {
        return this.body;
    }

}
