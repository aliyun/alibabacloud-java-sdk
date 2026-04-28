// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudOutboundPreviewObReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudOutboundPreviewObReportResponseBody body;

    public static CloudOutboundPreviewObReportResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudOutboundPreviewObReportResponse self = new CloudOutboundPreviewObReportResponse();
        return TeaModel.build(map, self);
    }

    public CloudOutboundPreviewObReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudOutboundPreviewObReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudOutboundPreviewObReportResponse setBody(CloudOutboundPreviewObReportResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudOutboundPreviewObReportResponseBody getBody() {
        return this.body;
    }

}
