// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class QueryUserResPoolInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryUserResPoolInfoResponseBody body;

    public static QueryUserResPoolInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUserResPoolInfoResponse self = new QueryUserResPoolInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryUserResPoolInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryUserResPoolInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryUserResPoolInfoResponse setBody(QueryUserResPoolInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryUserResPoolInfoResponseBody getBody() {
        return this.body;
    }

}
