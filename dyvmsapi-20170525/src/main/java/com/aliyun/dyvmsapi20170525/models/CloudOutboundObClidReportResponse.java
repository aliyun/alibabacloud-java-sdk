// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudOutboundObClidReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudOutboundObClidReportResponseBody body;

    public static CloudOutboundObClidReportResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudOutboundObClidReportResponse self = new CloudOutboundObClidReportResponse();
        return TeaModel.build(map, self);
    }

    public CloudOutboundObClidReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudOutboundObClidReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudOutboundObClidReportResponse setBody(CloudOutboundObClidReportResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudOutboundObClidReportResponseBody getBody() {
        return this.body;
    }

}
