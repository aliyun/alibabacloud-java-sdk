// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryMiniAppTaskLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMiniAppTaskLogResponseBody body;

    public static QueryMiniAppTaskLogResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMiniAppTaskLogResponse self = new QueryMiniAppTaskLogResponse();
        return TeaModel.build(map, self);
    }

    public QueryMiniAppTaskLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMiniAppTaskLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMiniAppTaskLogResponse setBody(QueryMiniAppTaskLogResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMiniAppTaskLogResponseBody getBody() {
        return this.body;
    }

}
