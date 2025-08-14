// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ResumeMediaConnectFlowOutputResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResumeMediaConnectFlowOutputResponseBody body;

    public static ResumeMediaConnectFlowOutputResponse build(java.util.Map<String, ?> map) throws Exception {
        ResumeMediaConnectFlowOutputResponse self = new ResumeMediaConnectFlowOutputResponse();
        return TeaModel.build(map, self);
    }

    public ResumeMediaConnectFlowOutputResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResumeMediaConnectFlowOutputResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResumeMediaConnectFlowOutputResponse setBody(ResumeMediaConnectFlowOutputResponseBody body) {
        this.body = body;
        return this;
    }
    public ResumeMediaConnectFlowOutputResponseBody getBody() {
        return this.body;
    }

}
