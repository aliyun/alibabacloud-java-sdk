// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class ExecuteOperationSyncResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteOperationSyncResponseBody body;

    public static ExecuteOperationSyncResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteOperationSyncResponse self = new ExecuteOperationSyncResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteOperationSyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteOperationSyncResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteOperationSyncResponse setBody(ExecuteOperationSyncResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteOperationSyncResponseBody getBody() {
        return this.body;
    }

}
