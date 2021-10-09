// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class QueryItemBackgroundsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryItemBackgroundsResponseBody body;

    public static QueryItemBackgroundsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryItemBackgroundsResponse self = new QueryItemBackgroundsResponse();
        return TeaModel.build(map, self);
    }

    public QueryItemBackgroundsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryItemBackgroundsResponse setBody(QueryItemBackgroundsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryItemBackgroundsResponseBody getBody() {
        return this.body;
    }

}
