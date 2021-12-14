// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class QueryCallCostListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryCallCostListResponseBody body;

    public static QueryCallCostListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCallCostListResponse self = new QueryCallCostListResponse();
        return TeaModel.build(map, self);
    }

    public QueryCallCostListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCallCostListResponse setBody(QueryCallCostListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCallCostListResponseBody getBody() {
        return this.body;
    }

}
