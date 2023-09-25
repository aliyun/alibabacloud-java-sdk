// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class QueryUsageStatisticsByTagIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryUsageStatisticsByTagIdResponseBody body;

    public static QueryUsageStatisticsByTagIdResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUsageStatisticsByTagIdResponse self = new QueryUsageStatisticsByTagIdResponse();
        return TeaModel.build(map, self);
    }

    public QueryUsageStatisticsByTagIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryUsageStatisticsByTagIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryUsageStatisticsByTagIdResponse setBody(QueryUsageStatisticsByTagIdResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryUsageStatisticsByTagIdResponseBody getBody() {
        return this.body;
    }

}
