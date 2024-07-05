// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryFpFileDeleteJobListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryFpFileDeleteJobListResponseBody body;

    public static QueryFpFileDeleteJobListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFpFileDeleteJobListResponse self = new QueryFpFileDeleteJobListResponse();
        return TeaModel.build(map, self);
    }

    public QueryFpFileDeleteJobListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryFpFileDeleteJobListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryFpFileDeleteJobListResponse setBody(QueryFpFileDeleteJobListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryFpFileDeleteJobListResponseBody getBody() {
        return this.body;
    }

}
