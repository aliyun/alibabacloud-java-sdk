// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class ReportDrGatewayStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReportDrGatewayStatusResponseBody body;

    public static ReportDrGatewayStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportDrGatewayStatusResponse self = new ReportDrGatewayStatusResponse();
        return TeaModel.build(map, self);
    }

    public ReportDrGatewayStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportDrGatewayStatusResponse setBody(ReportDrGatewayStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportDrGatewayStatusResponseBody getBody() {
        return this.body;
    }

}
