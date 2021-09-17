// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryUserGameProcessResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryUserGameProcessResponseBody body;

    public static QueryUserGameProcessResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUserGameProcessResponse self = new QueryUserGameProcessResponse();
        return TeaModel.build(map, self);
    }

    public QueryUserGameProcessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryUserGameProcessResponse setBody(QueryUserGameProcessResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryUserGameProcessResponseBody getBody() {
        return this.body;
    }

}
