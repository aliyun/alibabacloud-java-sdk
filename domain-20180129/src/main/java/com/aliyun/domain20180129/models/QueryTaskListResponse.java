// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryTaskListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTaskListResponseBody body;

    public static QueryTaskListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskListResponse self = new QueryTaskListResponse();
        return TeaModel.build(map, self);
    }

    public QueryTaskListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTaskListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTaskListResponse setBody(QueryTaskListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTaskListResponseBody getBody() {
        return this.body;
    }

}
