// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetCsccApprovalFlowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetCsccApprovalFlowResponseBody body;

    public static GetCsccApprovalFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCsccApprovalFlowResponse self = new GetCsccApprovalFlowResponse();
        return TeaModel.build(map, self);
    }

    public GetCsccApprovalFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCsccApprovalFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCsccApprovalFlowResponse setBody(GetCsccApprovalFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCsccApprovalFlowResponseBody getBody() {
        return this.body;
    }

}
