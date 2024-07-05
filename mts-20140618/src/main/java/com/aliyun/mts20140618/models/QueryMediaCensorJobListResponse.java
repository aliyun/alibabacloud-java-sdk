// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryMediaCensorJobListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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
