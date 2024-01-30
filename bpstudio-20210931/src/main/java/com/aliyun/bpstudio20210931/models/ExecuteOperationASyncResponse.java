// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class ExecuteOperationASyncResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteOperationASyncResponseBody body;

    public static ExecuteOperationASyncResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteOperationASyncResponse self = new ExecuteOperationASyncResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteOperationASyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteOperationASyncResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteOperationASyncResponse setBody(ExecuteOperationASyncResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteOperationASyncResponseBody getBody() {
        return this.body;
    }

}
