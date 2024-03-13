// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryUserOmsDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryUserOmsDataResponseBody body;

    public static QueryUserOmsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUserOmsDataResponse self = new QueryUserOmsDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryUserOmsDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryUserOmsDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryUserOmsDataResponse setBody(QueryUserOmsDataResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryUserOmsDataResponseBody getBody() {
        return this.body;
    }

}
