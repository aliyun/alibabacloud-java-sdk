// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ExecuteStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecuteStatusResponseBody body;

    public static ExecuteStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteStatusResponse self = new ExecuteStatusResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteStatusResponse setBody(ExecuteStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteStatusResponseBody getBody() {
        return this.body;
    }

}
