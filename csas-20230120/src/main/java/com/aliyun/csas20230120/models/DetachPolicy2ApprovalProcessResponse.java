// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DetachPolicy2ApprovalProcessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetachPolicy2ApprovalProcessResponseBody body;

    public static DetachPolicy2ApprovalProcessResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachPolicy2ApprovalProcessResponse self = new DetachPolicy2ApprovalProcessResponse();
        return TeaModel.build(map, self);
    }

    public DetachPolicy2ApprovalProcessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachPolicy2ApprovalProcessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachPolicy2ApprovalProcessResponse setBody(DetachPolicy2ApprovalProcessResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachPolicy2ApprovalProcessResponseBody getBody() {
        return this.body;
    }

}
