// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class QueryActiveUserStatisticResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryActiveUserStatisticResponseBody body;

    public static QueryActiveUserStatisticResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryActiveUserStatisticResponse self = new QueryActiveUserStatisticResponse();
        return TeaModel.build(map, self);
    }

    public QueryActiveUserStatisticResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryActiveUserStatisticResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryActiveUserStatisticResponse setBody(QueryActiveUserStatisticResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryActiveUserStatisticResponseBody getBody() {
        return this.body;
    }

}
