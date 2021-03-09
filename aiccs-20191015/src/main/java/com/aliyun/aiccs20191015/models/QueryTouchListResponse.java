// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class QueryTouchListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTouchListResponseBody body;

    public static QueryTouchListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTouchListResponse self = new QueryTouchListResponse();
        return TeaModel.build(map, self);
    }

    public QueryTouchListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTouchListResponse setBody(QueryTouchListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTouchListResponseBody getBody() {
        return this.body;
    }

}
