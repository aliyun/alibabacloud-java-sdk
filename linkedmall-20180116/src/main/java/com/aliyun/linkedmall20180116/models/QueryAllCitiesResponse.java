// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryAllCitiesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAllCitiesResponseBody body;

    public static QueryAllCitiesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAllCitiesResponse self = new QueryAllCitiesResponse();
        return TeaModel.build(map, self);
    }

    public QueryAllCitiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAllCitiesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAllCitiesResponse setBody(QueryAllCitiesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAllCitiesResponseBody getBody() {
        return this.body;
    }

}
