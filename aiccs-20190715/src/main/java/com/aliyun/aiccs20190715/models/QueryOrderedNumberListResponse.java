// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class QueryOrderedNumberListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryOrderedNumberListResponseBody body;

    public static QueryOrderedNumberListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderedNumberListResponse self = new QueryOrderedNumberListResponse();
        return TeaModel.build(map, self);
    }

    public QueryOrderedNumberListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryOrderedNumberListResponse setBody(QueryOrderedNumberListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryOrderedNumberListResponseBody getBody() {
        return this.body;
    }

}
