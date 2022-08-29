// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetCsccApprovalInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetCsccApprovalInfoResponseBody body;

    public static GetCsccApprovalInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCsccApprovalInfoResponse self = new GetCsccApprovalInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetCsccApprovalInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCsccApprovalInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCsccApprovalInfoResponse setBody(GetCsccApprovalInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCsccApprovalInfoResponseBody getBody() {
        return this.body;
    }

}
