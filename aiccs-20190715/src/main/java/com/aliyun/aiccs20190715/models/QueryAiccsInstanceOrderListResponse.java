// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class QueryAiccsInstanceOrderListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAiccsInstanceOrderListResponseBody body;

    public static QueryAiccsInstanceOrderListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAiccsInstanceOrderListResponse self = new QueryAiccsInstanceOrderListResponse();
        return TeaModel.build(map, self);
    }

    public QueryAiccsInstanceOrderListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAiccsInstanceOrderListResponse setBody(QueryAiccsInstanceOrderListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAiccsInstanceOrderListResponseBody getBody() {
        return this.body;
    }

}
