// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ExecuteInstanceFailoverResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteInstanceFailoverResponseBody body;

    public static ExecuteInstanceFailoverResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteInstanceFailoverResponse self = new ExecuteInstanceFailoverResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteInstanceFailoverResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteInstanceFailoverResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteInstanceFailoverResponse setBody(ExecuteInstanceFailoverResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteInstanceFailoverResponseBody getBody() {
        return this.body;
    }

}
