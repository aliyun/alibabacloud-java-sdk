// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class QueryBatchStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryBatchStatusResponseBody body;

    public static QueryBatchStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBatchStatusResponse self = new QueryBatchStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryBatchStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryBatchStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryBatchStatusResponse setBody(QueryBatchStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryBatchStatusResponseBody getBody() {
        return this.body;
    }

}
