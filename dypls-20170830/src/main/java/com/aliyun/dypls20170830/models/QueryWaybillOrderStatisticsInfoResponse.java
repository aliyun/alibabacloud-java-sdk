// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class QueryWaybillOrderStatisticsInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryWaybillOrderStatisticsInfoResponseBody body;

    public static QueryWaybillOrderStatisticsInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryWaybillOrderStatisticsInfoResponse self = new QueryWaybillOrderStatisticsInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryWaybillOrderStatisticsInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryWaybillOrderStatisticsInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryWaybillOrderStatisticsInfoResponse setBody(QueryWaybillOrderStatisticsInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryWaybillOrderStatisticsInfoResponseBody getBody() {
        return this.body;
    }

}
