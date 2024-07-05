// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryFpShotJobListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryFpShotJobListResponseBody body;

    public static QueryFpShotJobListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFpShotJobListResponse self = new QueryFpShotJobListResponse();
        return TeaModel.build(map, self);
    }

    public QueryFpShotJobListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryFpShotJobListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryFpShotJobListResponse setBody(QueryFpShotJobListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryFpShotJobListResponseBody getBody() {
        return this.body;
    }

}
