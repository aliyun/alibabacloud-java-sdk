// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class QueryApmComponentsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryApmComponentsResponseBody body;

    public static QueryApmComponentsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryApmComponentsResponse self = new QueryApmComponentsResponse();
        return TeaModel.build(map, self);
    }

    public QueryApmComponentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryApmComponentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryApmComponentsResponse setBody(QueryApmComponentsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryApmComponentsResponseBody getBody() {
        return this.body;
    }

}
