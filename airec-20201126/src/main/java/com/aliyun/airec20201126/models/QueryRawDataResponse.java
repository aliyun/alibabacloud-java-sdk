// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class QueryRawDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryRawDataResponseBody body;

    public static QueryRawDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRawDataResponse self = new QueryRawDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryRawDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRawDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryRawDataResponse setBody(QueryRawDataResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRawDataResponseBody getBody() {
        return this.body;
    }

}
