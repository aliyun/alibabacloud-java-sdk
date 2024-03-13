// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryRedeemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryRedeemResponseBody body;

    public static QueryRedeemResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRedeemResponse self = new QueryRedeemResponse();
        return TeaModel.build(map, self);
    }

    public QueryRedeemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRedeemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryRedeemResponse setBody(QueryRedeemResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRedeemResponseBody getBody() {
        return this.body;
    }

}
