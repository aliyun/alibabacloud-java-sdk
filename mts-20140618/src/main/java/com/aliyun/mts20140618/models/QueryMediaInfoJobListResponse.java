// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryMediaInfoJobListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryMediaInfoJobListResponseBody body;

    public static QueryMediaInfoJobListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMediaInfoJobListResponse self = new QueryMediaInfoJobListResponse();
        return TeaModel.build(map, self);
    }

    public QueryMediaInfoJobListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMediaInfoJobListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMediaInfoJobListResponse setBody(QueryMediaInfoJobListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMediaInfoJobListResponseBody getBody() {
        return this.body;
    }

}
