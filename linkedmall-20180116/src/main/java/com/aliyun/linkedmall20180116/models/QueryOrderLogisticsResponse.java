// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryOrderLogisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public QueryOrderLogisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryOrderLogisticsResponse setBody(QueryOrderLogisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryOrderLogisticsResponseBody getBody() {
        return this.body;
    }

}
