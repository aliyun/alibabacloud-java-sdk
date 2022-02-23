// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20210609.models;

import com.aliyun.tea.*;

public class QueryFusionOrderListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryFusionOrderListResponseBody body;

    public static QueryFusionOrderListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFusionOrderListResponse self = new QueryFusionOrderListResponse();
        return TeaModel.build(map, self);
    }

    public QueryFusionOrderListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryFusionOrderListResponse setBody(QueryFusionOrderListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryFusionOrderListResponseBody getBody() {
        return this.body;
    }

}
