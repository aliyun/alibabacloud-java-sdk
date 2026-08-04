// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class QueryDeleteTaskCheckDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDeleteTaskCheckDataResponseBody body;

    public static QueryDeleteTaskCheckDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeleteTaskCheckDataResponse self = new QueryDeleteTaskCheckDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeleteTaskCheckDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDeleteTaskCheckDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDeleteTaskCheckDataResponse setBody(QueryDeleteTaskCheckDataResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDeleteTaskCheckDataResponseBody getBody() {
        return this.body;
    }

}
