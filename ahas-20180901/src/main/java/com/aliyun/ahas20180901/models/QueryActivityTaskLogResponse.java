// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryActivityTaskLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryActivityTaskLogResponseBody body;

    public static QueryActivityTaskLogResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryActivityTaskLogResponse self = new QueryActivityTaskLogResponse();
        return TeaModel.build(map, self);
    }

    public QueryActivityTaskLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryActivityTaskLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryActivityTaskLogResponse setBody(QueryActivityTaskLogResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryActivityTaskLogResponseBody getBody() {
        return this.body;
    }

}
