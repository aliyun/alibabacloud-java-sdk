// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryFpDBDeleteJobListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryFpDBDeleteJobListResponseBody body;

    public static QueryFpDBDeleteJobListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFpDBDeleteJobListResponse self = new QueryFpDBDeleteJobListResponse();
        return TeaModel.build(map, self);
    }

    public QueryFpDBDeleteJobListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryFpDBDeleteJobListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryFpDBDeleteJobListResponse setBody(QueryFpDBDeleteJobListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryFpDBDeleteJobListResponseBody getBody() {
        return this.body;
    }

}
