// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class SubmitOrderApprovalResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitOrderApprovalResponseBody body;

    public static SubmitOrderApprovalResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitOrderApprovalResponse self = new SubmitOrderApprovalResponse();
        return TeaModel.build(map, self);
    }

    public SubmitOrderApprovalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitOrderApprovalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitOrderApprovalResponse setBody(SubmitOrderApprovalResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitOrderApprovalResponseBody getBody() {
        return this.body;
    }

}
