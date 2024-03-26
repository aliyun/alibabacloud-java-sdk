// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class StartSyncExecutionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartSyncExecutionResponseBody body;

    public static StartSyncExecutionResponse build(java.util.Map<String, ?> map) throws Exception {
        StartSyncExecutionResponse self = new StartSyncExecutionResponse();
        return TeaModel.build(map, self);
    }

    public StartSyncExecutionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartSyncExecutionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartSyncExecutionResponse setBody(StartSyncExecutionResponseBody body) {
        this.body = body;
        return this;
    }
    public StartSyncExecutionResponseBody getBody() {
        return this.body;
    }

}
