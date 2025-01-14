// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateApprovalProcessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateApprovalProcessResponseBody body;

    public static UpdateApprovalProcessResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateApprovalProcessResponse self = new UpdateApprovalProcessResponse();
        return TeaModel.build(map, self);
    }

    public UpdateApprovalProcessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateApprovalProcessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateApprovalProcessResponse setBody(UpdateApprovalProcessResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateApprovalProcessResponseBody getBody() {
        return this.body;
    }

}
