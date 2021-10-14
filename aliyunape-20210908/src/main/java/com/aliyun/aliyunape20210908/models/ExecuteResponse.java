// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliyunape20210908.models;

import com.aliyun.tea.*;

public class ExecuteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecuteResponseBody body;

    public static ExecuteResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteResponse self = new ExecuteResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteResponse setBody(ExecuteResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteResponseBody getBody() {
        return this.body;
    }

}
