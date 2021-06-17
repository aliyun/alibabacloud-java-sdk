// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class QueryTaskResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTaskResultResponseBody body;

    public static QueryTaskResultResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskResultResponse self = new QueryTaskResultResponse();
        return TeaModel.build(map, self);
    }

    public QueryTaskResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTaskResultResponse setBody(QueryTaskResultResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTaskResultResponseBody getBody() {
        return this.body;
    }

}
