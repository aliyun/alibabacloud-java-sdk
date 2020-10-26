// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gts_dayu20201023.models;

import com.aliyun.tea.*;

public class QueryListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryListResponseBody body;

    public static QueryListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryListResponse self = new QueryListResponse();
        return TeaModel.build(map, self);
    }

    public QueryListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryListResponse setBody(QueryListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryListResponseBody getBody() {
        return this.body;
    }

}
