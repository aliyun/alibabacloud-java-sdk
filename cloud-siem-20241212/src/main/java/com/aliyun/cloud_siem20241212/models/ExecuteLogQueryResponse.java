// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ExecuteLogQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteLogQueryResponseBody body;

    public static ExecuteLogQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteLogQueryResponse self = new ExecuteLogQueryResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteLogQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteLogQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteLogQueryResponse setBody(ExecuteLogQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteLogQueryResponseBody getBody() {
        return this.body;
    }

}
