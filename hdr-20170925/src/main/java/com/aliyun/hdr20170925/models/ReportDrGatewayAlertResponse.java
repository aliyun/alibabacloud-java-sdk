// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class ReportDrGatewayAlertResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReportDrGatewayAlertResponseBody body;

    public static ReportDrGatewayAlertResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportDrGatewayAlertResponse self = new ReportDrGatewayAlertResponse();
        return TeaModel.build(map, self);
    }

    public ReportDrGatewayAlertResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportDrGatewayAlertResponse setBody(ReportDrGatewayAlertResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportDrGatewayAlertResponseBody getBody() {
        return this.body;
    }

}
