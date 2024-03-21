// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class ReportEdsAgentInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReportEdsAgentInfoResponseBody body;

    public static ReportEdsAgentInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportEdsAgentInfoResponse self = new ReportEdsAgentInfoResponse();
        return TeaModel.build(map, self);
    }

    public ReportEdsAgentInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportEdsAgentInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReportEdsAgentInfoResponse setBody(ReportEdsAgentInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportEdsAgentInfoResponseBody getBody() {
        return this.body;
    }

}
