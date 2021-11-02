// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryOrderCommissionRateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryOrderCommissionRateResponseBody body;

    public static QueryOrderCommissionRateResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderCommissionRateResponse self = new QueryOrderCommissionRateResponse();
        return TeaModel.build(map, self);
    }

    public QueryOrderCommissionRateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryOrderCommissionRateResponse setBody(QueryOrderCommissionRateResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryOrderCommissionRateResponseBody getBody() {
        return this.body;
    }

}
