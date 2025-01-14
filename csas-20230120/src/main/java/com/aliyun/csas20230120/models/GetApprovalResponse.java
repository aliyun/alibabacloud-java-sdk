// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetApprovalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetApprovalResponseBody body;

    public static GetApprovalResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApprovalResponse self = new GetApprovalResponse();
        return TeaModel.build(map, self);
    }

    public GetApprovalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetApprovalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetApprovalResponse setBody(GetApprovalResponseBody body) {
        this.body = body;
        return this;
    }
    public GetApprovalResponseBody getBody() {
        return this.body;
    }

}
