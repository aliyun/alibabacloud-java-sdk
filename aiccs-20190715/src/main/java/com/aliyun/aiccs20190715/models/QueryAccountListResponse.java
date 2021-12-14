// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class QueryAccountListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAccountListResponseBody body;

    public static QueryAccountListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAccountListResponse self = new QueryAccountListResponse();
        return TeaModel.build(map, self);
    }

    public QueryAccountListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAccountListResponse setBody(QueryAccountListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAccountListResponseBody getBody() {
        return this.body;
    }

}
