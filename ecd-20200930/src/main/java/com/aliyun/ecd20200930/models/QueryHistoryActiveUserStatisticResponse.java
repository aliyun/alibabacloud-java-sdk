// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class QueryHistoryActiveUserStatisticResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryHistoryActiveUserStatisticResponseBody body;

    public static QueryHistoryActiveUserStatisticResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHistoryActiveUserStatisticResponse self = new QueryHistoryActiveUserStatisticResponse();
        return TeaModel.build(map, self);
    }

    public QueryHistoryActiveUserStatisticResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHistoryActiveUserStatisticResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryHistoryActiveUserStatisticResponse setBody(QueryHistoryActiveUserStatisticResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHistoryActiveUserStatisticResponseBody getBody() {
        return this.body;
    }

}
