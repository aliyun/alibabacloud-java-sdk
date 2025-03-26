// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class QueryProjectListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryProjectListResponseBody body;

    public static QueryProjectListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryProjectListResponse self = new QueryProjectListResponse();
        return TeaModel.build(map, self);
    }

    public QueryProjectListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryProjectListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryProjectListResponse setBody(QueryProjectListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryProjectListResponseBody getBody() {
        return this.body;
    }

}
