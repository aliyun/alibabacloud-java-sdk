// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class QueryGameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryGameResponseBody body;

    public static QueryGameResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryGameResponse self = new QueryGameResponse();
        return TeaModel.build(map, self);
    }

    public QueryGameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryGameResponse setBody(QueryGameResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryGameResponseBody getBody() {
        return this.body;
    }

}
