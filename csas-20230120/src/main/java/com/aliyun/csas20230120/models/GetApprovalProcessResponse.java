// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetApprovalProcessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetApprovalProcessResponseBody body;

    public static GetApprovalProcessResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApprovalProcessResponse self = new GetApprovalProcessResponse();
        return TeaModel.build(map, self);
    }

    public GetApprovalProcessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetApprovalProcessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetApprovalProcessResponse setBody(GetApprovalProcessResponseBody body) {
        this.body = body;
        return this;
    }
    public GetApprovalProcessResponseBody getBody() {
        return this.body;
    }

}
