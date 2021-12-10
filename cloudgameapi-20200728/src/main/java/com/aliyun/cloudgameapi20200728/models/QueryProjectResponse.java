// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class QueryProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryProjectResponseBody body;

    public static QueryProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryProjectResponse self = new QueryProjectResponse();
        return TeaModel.build(map, self);
    }

    public QueryProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryProjectResponse setBody(QueryProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryProjectResponseBody getBody() {
        return this.body;
    }

}
