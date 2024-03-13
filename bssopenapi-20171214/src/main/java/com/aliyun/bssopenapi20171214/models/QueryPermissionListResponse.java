// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryPermissionListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryPermissionListResponseBody body;

    public static QueryPermissionListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPermissionListResponse self = new QueryPermissionListResponse();
        return TeaModel.build(map, self);
    }

    public QueryPermissionListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPermissionListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryPermissionListResponse setBody(QueryPermissionListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPermissionListResponseBody getBody() {
        return this.body;
    }

}
