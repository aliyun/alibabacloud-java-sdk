// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetCsccApprovalStatsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetCsccApprovalStatsResponseBody body;

    public static GetCsccApprovalStatsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCsccApprovalStatsResponse self = new GetCsccApprovalStatsResponse();
        return TeaModel.build(map, self);
    }

    public GetCsccApprovalStatsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCsccApprovalStatsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCsccApprovalStatsResponse setBody(GetCsccApprovalStatsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCsccApprovalStatsResponseBody getBody() {
        return this.body;
    }

}
