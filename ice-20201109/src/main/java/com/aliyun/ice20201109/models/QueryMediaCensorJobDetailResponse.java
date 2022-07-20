// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class QueryMediaCensorJobDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMediaCensorJobDetailResponseBody body;

    public static QueryMediaCensorJobDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMediaCensorJobDetailResponse self = new QueryMediaCensorJobDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryMediaCensorJobDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMediaCensorJobDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMediaCensorJobDetailResponse setBody(QueryMediaCensorJobDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMediaCensorJobDetailResponseBody getBody() {
        return this.body;
    }

}
