// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ReportNodesStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReportNodesStatusResponseBody body;

    public static ReportNodesStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportNodesStatusResponse self = new ReportNodesStatusResponse();
        return TeaModel.build(map, self);
    }

    public ReportNodesStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportNodesStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReportNodesStatusResponse setBody(ReportNodesStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportNodesStatusResponseBody getBody() {
        return this.body;
    }

}
