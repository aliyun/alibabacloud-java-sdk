// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class AttachGatewayDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AttachGatewayDomainResponseBody body;

    public static AttachGatewayDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachGatewayDomainResponse self = new AttachGatewayDomainResponse();
        return TeaModel.build(map, self);
    }

    public AttachGatewayDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachGatewayDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachGatewayDomainResponse setBody(AttachGatewayDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachGatewayDomainResponseBody getBody() {
        return this.body;
    }

}
