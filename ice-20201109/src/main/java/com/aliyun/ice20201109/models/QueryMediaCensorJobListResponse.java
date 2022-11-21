// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class QueryMediaCensorJobListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMediaCensorJobListResponseBody body;

    public static QueryMediaCensorJobListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMediaCensorJobListResponse self = new QueryMediaCensorJobListResponse();
        return TeaModel.build(map, self);
    }

    public QueryMediaCensorJobListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMediaCensorJobListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMediaCensorJobListResponse setBody(QueryMediaCensorJobListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMediaCensorJobListResponseBody getBody() {
        return this.body;
    }

}
