// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class QueryTaskLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTaskLogResponseBody body;

    public static QueryTaskLogResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskLogResponse self = new QueryTaskLogResponse();
        return TeaModel.build(map, self);
    }

    public QueryTaskLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTaskLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTaskLogResponse setBody(QueryTaskLogResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTaskLogResponseBody getBody() {
        return this.body;
    }

}
