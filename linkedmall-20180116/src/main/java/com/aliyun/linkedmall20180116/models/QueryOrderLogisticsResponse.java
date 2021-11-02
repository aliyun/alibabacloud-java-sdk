// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryOrderLogisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryOrderLogisticsResponseBody body;

    public static QueryOrderLogisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderLogisticsResponse self = new QueryOrderLogisticsResponse();
        return TeaModel.build(map, self);
    }

    public QueryOrderLogisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryOrderLogisticsResponse setBody(QueryOrderLogisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryOrderLogisticsResponseBody getBody() {
        return this.body;
    }

}
