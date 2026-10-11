// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class CreateEgressProxyGatewayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateEgressProxyGatewayResponseBody body;

    public static CreateEgressProxyGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEgressProxyGatewayResponse self = new CreateEgressProxyGatewayResponse();
        return TeaModel.build(map, self);
    }

    public CreateEgressProxyGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEgressProxyGatewayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEgressProxyGatewayResponse setBody(CreateEgressProxyGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEgressProxyGatewayResponseBody getBody() {
        return this.body;
    }

}
