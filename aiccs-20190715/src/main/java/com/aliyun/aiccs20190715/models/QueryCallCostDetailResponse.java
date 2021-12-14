// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class QueryCallCostDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryCallCostDetailResponseBody body;

    public static QueryCallCostDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCallCostDetailResponse self = new QueryCallCostDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryCallCostDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCallCostDetailResponse setBody(QueryCallCostDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCallCostDetailResponseBody getBody() {
        return this.body;
    }

}
