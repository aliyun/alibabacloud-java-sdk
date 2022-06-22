// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryOverviewBasicResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryOverviewBasicResponseBody body;

    public static QueryOverviewBasicResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOverviewBasicResponse self = new QueryOverviewBasicResponse();
        return TeaModel.build(map, self);
    }

    public QueryOverviewBasicResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryOverviewBasicResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryOverviewBasicResponse setBody(QueryOverviewBasicResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryOverviewBasicResponseBody getBody() {
        return this.body;
    }

}
