// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryBusinessLocationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryBusinessLocationsResponseBody body;

    public static QueryBusinessLocationsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBusinessLocationsResponse self = new QueryBusinessLocationsResponse();
        return TeaModel.build(map, self);
    }

    public QueryBusinessLocationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryBusinessLocationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryBusinessLocationsResponse setBody(QueryBusinessLocationsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryBusinessLocationsResponseBody getBody() {
        return this.body;
    }

}
