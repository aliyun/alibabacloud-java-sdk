// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class QueryOperationIndexResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryOperationIndexResponseBody body;

    public static QueryOperationIndexResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOperationIndexResponse self = new QueryOperationIndexResponse();
        return TeaModel.build(map, self);
    }

    public QueryOperationIndexResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryOperationIndexResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryOperationIndexResponse setBody(QueryOperationIndexResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryOperationIndexResponseBody getBody() {
        return this.body;
    }

}
