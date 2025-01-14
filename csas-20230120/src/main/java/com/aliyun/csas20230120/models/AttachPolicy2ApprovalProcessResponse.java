// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class AttachPolicy2ApprovalProcessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AttachPolicy2ApprovalProcessResponseBody body;

    public static AttachPolicy2ApprovalProcessResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachPolicy2ApprovalProcessResponse self = new AttachPolicy2ApprovalProcessResponse();
        return TeaModel.build(map, self);
    }

    public AttachPolicy2ApprovalProcessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachPolicy2ApprovalProcessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachPolicy2ApprovalProcessResponse setBody(AttachPolicy2ApprovalProcessResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachPolicy2ApprovalProcessResponseBody getBody() {
        return this.body;
    }

}
