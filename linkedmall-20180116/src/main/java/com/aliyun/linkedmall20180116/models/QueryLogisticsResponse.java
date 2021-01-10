// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryLogisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLogisticsResponseBody body;

    public static QueryLogisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLogisticsResponse self = new QueryLogisticsResponse();
        return TeaModel.build(map, self);
    }

    public QueryLogisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLogisticsResponse setBody(QueryLogisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLogisticsResponseBody getBody() {
        return this.body;
    }

}
