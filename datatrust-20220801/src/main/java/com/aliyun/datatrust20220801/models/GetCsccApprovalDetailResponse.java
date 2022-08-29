// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetCsccApprovalDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetCsccApprovalDetailResponseBody body;

    public static GetCsccApprovalDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCsccApprovalDetailResponse self = new GetCsccApprovalDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetCsccApprovalDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCsccApprovalDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCsccApprovalDetailResponse setBody(GetCsccApprovalDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCsccApprovalDetailResponseBody getBody() {
        return this.body;
    }

}
