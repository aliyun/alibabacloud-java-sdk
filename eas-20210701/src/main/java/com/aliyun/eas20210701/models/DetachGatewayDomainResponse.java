// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DetachGatewayDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetachGatewayDomainResponseBody body;

    public static DetachGatewayDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachGatewayDomainResponse self = new DetachGatewayDomainResponse();
        return TeaModel.build(map, self);
    }

    public DetachGatewayDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachGatewayDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachGatewayDomainResponse setBody(DetachGatewayDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachGatewayDomainResponseBody getBody() {
        return this.body;
    }

}
