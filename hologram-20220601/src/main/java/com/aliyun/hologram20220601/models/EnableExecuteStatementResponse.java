// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class EnableExecuteStatementResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableExecuteStatementResponseBody body;

    public static EnableExecuteStatementResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableExecuteStatementResponse self = new EnableExecuteStatementResponse();
        return TeaModel.build(map, self);
    }

    public EnableExecuteStatementResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableExecuteStatementResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableExecuteStatementResponse setBody(EnableExecuteStatementResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableExecuteStatementResponseBody getBody() {
        return this.body;
    }

}
