// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryMasFileOperationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMasFileOperationResponseBody body;

    public static QueryMasFileOperationResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMasFileOperationResponse self = new QueryMasFileOperationResponse();
        return TeaModel.build(map, self);
    }

    public QueryMasFileOperationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMasFileOperationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMasFileOperationResponse setBody(QueryMasFileOperationResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMasFileOperationResponseBody getBody() {
        return this.body;
    }

}
