// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class SubmitCsccApprovalResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitCsccApprovalResponseBody body;

    public static SubmitCsccApprovalResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitCsccApprovalResponse self = new SubmitCsccApprovalResponse();
        return TeaModel.build(map, self);
    }

    public SubmitCsccApprovalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitCsccApprovalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitCsccApprovalResponse setBody(SubmitCsccApprovalResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitCsccApprovalResponseBody getBody() {
        return this.body;
    }

}
