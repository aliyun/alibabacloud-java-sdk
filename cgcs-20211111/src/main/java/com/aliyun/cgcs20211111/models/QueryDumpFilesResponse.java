// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class QueryDumpFilesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDumpFilesResponseBody body;

    public static QueryDumpFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDumpFilesResponse self = new QueryDumpFilesResponse();
        return TeaModel.build(map, self);
    }

    public QueryDumpFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDumpFilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDumpFilesResponse setBody(QueryDumpFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDumpFilesResponseBody getBody() {
        return this.body;
    }

}
