// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateEthereumInvitationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateEthereumInvitationResponseBody body;

    public static CreateEthereumInvitationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEthereumInvitationResponse self = new CreateEthereumInvitationResponse();
        return TeaModel.build(map, self);
    }

    public CreateEthereumInvitationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEthereumInvitationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEthereumInvitationResponse setBody(CreateEthereumInvitationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEthereumInvitationResponseBody getBody() {
        return this.body;
    }

}
