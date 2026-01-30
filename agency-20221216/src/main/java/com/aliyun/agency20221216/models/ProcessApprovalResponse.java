// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class ProcessApprovalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ProcessApprovalResponseBody body;

    public static ProcessApprovalResponse build(java.util.Map<String, ?> map) throws Exception {
        ProcessApprovalResponse self = new ProcessApprovalResponse();
        return TeaModel.build(map, self);
    }

    public ProcessApprovalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ProcessApprovalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ProcessApprovalResponse setBody(ProcessApprovalResponseBody body) {
        this.body = body;
        return this;
    }
    public ProcessApprovalResponseBody getBody() {
        return this.body;
    }

}
