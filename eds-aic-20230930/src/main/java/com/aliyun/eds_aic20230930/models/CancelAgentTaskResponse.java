// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CancelAgentTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelAgentTaskResponseBody body;

    public static CancelAgentTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelAgentTaskResponse self = new CancelAgentTaskResponse();
        return TeaModel.build(map, self);
    }

    public CancelAgentTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelAgentTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelAgentTaskResponse setBody(CancelAgentTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelAgentTaskResponseBody getBody() {
        return this.body;
    }

}
