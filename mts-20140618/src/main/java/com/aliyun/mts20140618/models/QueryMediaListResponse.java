// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryMediaListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMediaListResponseBody body;

    public static QueryMediaListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMediaListResponse self = new QueryMediaListResponse();
        return TeaModel.build(map, self);
    }

    public QueryMediaListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMediaListResponse setBody(QueryMediaListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMediaListResponseBody getBody() {
        return this.body;
    }

}
