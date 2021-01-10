// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTaskResponseBody body;

    public static QueryTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskResponse self = new QueryTaskResponse();
        return TeaModel.build(map, self);
    }

    public QueryTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTaskResponse setBody(QueryTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTaskResponseBody getBody() {
        return this.body;
    }

}
