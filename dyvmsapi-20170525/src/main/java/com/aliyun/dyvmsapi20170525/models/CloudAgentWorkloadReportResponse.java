// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudAgentWorkloadReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudAgentWorkloadReportResponseBody body;

    public static CloudAgentWorkloadReportResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudAgentWorkloadReportResponse self = new CloudAgentWorkloadReportResponse();
        return TeaModel.build(map, self);
    }

    public CloudAgentWorkloadReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudAgentWorkloadReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudAgentWorkloadReportResponse setBody(CloudAgentWorkloadReportResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudAgentWorkloadReportResponseBody getBody() {
        return this.body;
    }

}
