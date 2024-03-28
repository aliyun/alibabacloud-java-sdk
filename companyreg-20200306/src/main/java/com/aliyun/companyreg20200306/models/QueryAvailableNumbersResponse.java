// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class QueryAvailableNumbersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAvailableNumbersResponseBody body;

    public static QueryAvailableNumbersResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAvailableNumbersResponse self = new QueryAvailableNumbersResponse();
        return TeaModel.build(map, self);
    }

    public QueryAvailableNumbersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAvailableNumbersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAvailableNumbersResponse setBody(QueryAvailableNumbersResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAvailableNumbersResponseBody getBody() {
        return this.body;
    }

}
