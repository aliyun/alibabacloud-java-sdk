// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cciotgw20210721.models;

import com.aliyun.tea.*;

public class QueryAsynTokenResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAsynTokenResultResponseBody body;

    public static QueryAsynTokenResultResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAsynTokenResultResponse self = new QueryAsynTokenResultResponse();
        return TeaModel.build(map, self);
    }

    public QueryAsynTokenResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAsynTokenResultResponse setBody(QueryAsynTokenResultResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAsynTokenResultResponseBody getBody() {
        return this.body;
    }

}
