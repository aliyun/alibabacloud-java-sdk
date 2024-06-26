// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class ApproveEthereumInviteeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ApproveEthereumInviteeResponseBody body;

    public static ApproveEthereumInviteeResponse build(java.util.Map<String, ?> map) throws Exception {
        ApproveEthereumInviteeResponse self = new ApproveEthereumInviteeResponse();
        return TeaModel.build(map, self);
    }

    public ApproveEthereumInviteeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApproveEthereumInviteeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApproveEthereumInviteeResponse setBody(ApproveEthereumInviteeResponseBody body) {
        this.body = body;
        return this;
    }
    public ApproveEthereumInviteeResponseBody getBody() {
        return this.body;
    }

}
