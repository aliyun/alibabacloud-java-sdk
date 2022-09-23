// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class QueryStatisticsInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryStatisticsInfoResponseBody body;

    public static QueryStatisticsInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryStatisticsInfoResponse self = new QueryStatisticsInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryStatisticsInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryStatisticsInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryStatisticsInfoResponse setBody(QueryStatisticsInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryStatisticsInfoResponseBody getBody() {
        return this.body;
    }

}
