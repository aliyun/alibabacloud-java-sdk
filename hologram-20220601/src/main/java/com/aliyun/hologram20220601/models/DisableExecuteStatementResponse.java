// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class DisableExecuteStatementResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableExecuteStatementResponseBody body;

    public static DisableExecuteStatementResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableExecuteStatementResponse self = new DisableExecuteStatementResponse();
        return TeaModel.build(map, self);
    }

    public DisableExecuteStatementResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableExecuteStatementResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableExecuteStatementResponse setBody(DisableExecuteStatementResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableExecuteStatementResponseBody getBody() {
        return this.body;
    }

}
