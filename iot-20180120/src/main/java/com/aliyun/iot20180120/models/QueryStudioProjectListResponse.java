// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryStudioProjectListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryStudioProjectListResponseBody body;

    public static QueryStudioProjectListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryStudioProjectListResponse self = new QueryStudioProjectListResponse();
        return TeaModel.build(map, self);
    }

    public QueryStudioProjectListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryStudioProjectListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryStudioProjectListResponse setBody(QueryStudioProjectListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryStudioProjectListResponseBody getBody() {
        return this.body;
    }

}
