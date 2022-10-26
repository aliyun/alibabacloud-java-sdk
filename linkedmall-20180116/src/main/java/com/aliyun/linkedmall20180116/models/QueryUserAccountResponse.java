// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryUserAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryUserAccountResponseBody body;

    public static QueryUserAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUserAccountResponse self = new QueryUserAccountResponse();
        return TeaModel.build(map, self);
    }

    public QueryUserAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryUserAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryUserAccountResponse setBody(QueryUserAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryUserAccountResponseBody getBody() {
        return this.body;
    }

}
