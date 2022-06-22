// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryMiniAppTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMiniAppTaskResponseBody body;

    public static QueryMiniAppTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMiniAppTaskResponse self = new QueryMiniAppTaskResponse();
        return TeaModel.build(map, self);
    }

    public QueryMiniAppTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMiniAppTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMiniAppTaskResponse setBody(QueryMiniAppTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMiniAppTaskResponseBody getBody() {
        return this.body;
    }

}
