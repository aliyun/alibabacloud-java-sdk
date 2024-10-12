// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class QueryRestaurantsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryRestaurantsResponseBody body;

    public static QueryRestaurantsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRestaurantsResponse self = new QueryRestaurantsResponse();
        return TeaModel.build(map, self);
    }

    public QueryRestaurantsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRestaurantsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryRestaurantsResponse setBody(QueryRestaurantsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRestaurantsResponseBody getBody() {
        return this.body;
    }

}
