// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class QueryOutboundTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryOutboundTaskResponseBody body;

    public static QueryOutboundTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOutboundTaskResponse self = new QueryOutboundTaskResponse();
        return TeaModel.build(map, self);
    }

    public QueryOutboundTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryOutboundTaskResponse setBody(QueryOutboundTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryOutboundTaskResponseBody getBody() {
        return this.body;
    }

}
