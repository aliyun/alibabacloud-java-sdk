// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ListDiagnosticResultsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDiagnosticResultsResponseBody body;

    public static ListDiagnosticResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDiagnosticResultsResponse self = new ListDiagnosticResultsResponse();
        return TeaModel.build(map, self);
    }

    public ListDiagnosticResultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDiagnosticResultsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDiagnosticResultsResponse setBody(ListDiagnosticResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDiagnosticResultsResponseBody getBody() {
        return this.body;
    }

}
