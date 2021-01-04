// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class ExecuteNodeToolResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecuteNodeToolResponseBody body;

    public static ExecuteNodeToolResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteNodeToolResponse self = new ExecuteNodeToolResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteNodeToolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteNodeToolResponse setBody(ExecuteNodeToolResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteNodeToolResponseBody getBody() {
        return this.body;
    }

}
