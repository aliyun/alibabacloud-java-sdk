// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class StopNodeDiagnosticResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopNodeDiagnosticResponseBody body;

    public static StopNodeDiagnosticResponse build(java.util.Map<String, ?> map) throws Exception {
        StopNodeDiagnosticResponse self = new StopNodeDiagnosticResponse();
        return TeaModel.build(map, self);
    }

    public StopNodeDiagnosticResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopNodeDiagnosticResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopNodeDiagnosticResponse setBody(StopNodeDiagnosticResponseBody body) {
        this.body = body;
        return this;
    }
    public StopNodeDiagnosticResponseBody getBody() {
        return this.body;
    }

}
