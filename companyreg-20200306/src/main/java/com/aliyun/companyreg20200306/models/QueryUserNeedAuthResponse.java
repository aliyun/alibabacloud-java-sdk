// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class QueryUserNeedAuthResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryUserNeedAuthResponseBody body;

    public static QueryUserNeedAuthResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUserNeedAuthResponse self = new QueryUserNeedAuthResponse();
        return TeaModel.build(map, self);
    }

    public QueryUserNeedAuthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryUserNeedAuthResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryUserNeedAuthResponse setBody(QueryUserNeedAuthResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryUserNeedAuthResponseBody getBody() {
        return this.body;
    }

}
