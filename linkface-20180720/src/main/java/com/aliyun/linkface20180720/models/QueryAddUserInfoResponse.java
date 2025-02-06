// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkface20180720.models;

import com.aliyun.tea.*;

public class QueryAddUserInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAddUserInfoResponseBody body;

    public static QueryAddUserInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAddUserInfoResponse self = new QueryAddUserInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryAddUserInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAddUserInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAddUserInfoResponse setBody(QueryAddUserInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAddUserInfoResponseBody getBody() {
        return this.body;
    }

}
