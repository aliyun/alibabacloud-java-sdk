// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class StartDataAgentAccuracyTestTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartDataAgentAccuracyTestTaskResponseBody body;

    public static StartDataAgentAccuracyTestTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StartDataAgentAccuracyTestTaskResponse self = new StartDataAgentAccuracyTestTaskResponse();
        return TeaModel.build(map, self);
    }

    public StartDataAgentAccuracyTestTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartDataAgentAccuracyTestTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartDataAgentAccuracyTestTaskResponse setBody(StartDataAgentAccuracyTestTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StartDataAgentAccuracyTestTaskResponseBody getBody() {
        return this.body;
    }

}
