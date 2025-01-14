// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateApprovalStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateApprovalStatusResponseBody body;

    public static UpdateApprovalStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateApprovalStatusResponse self = new UpdateApprovalStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateApprovalStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateApprovalStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateApprovalStatusResponse setBody(UpdateApprovalStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateApprovalStatusResponseBody getBody() {
        return this.body;
    }

}
