// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class AcceptEthereumInvitationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AcceptEthereumInvitationResponseBody body;

    public static AcceptEthereumInvitationResponse build(java.util.Map<String, ?> map) throws Exception {
        AcceptEthereumInvitationResponse self = new AcceptEthereumInvitationResponse();
        return TeaModel.build(map, self);
    }

    public AcceptEthereumInvitationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AcceptEthereumInvitationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AcceptEthereumInvitationResponse setBody(AcceptEthereumInvitationResponseBody body) {
        this.body = body;
        return this;
    }
    public AcceptEthereumInvitationResponseBody getBody() {
        return this.body;
    }

}
