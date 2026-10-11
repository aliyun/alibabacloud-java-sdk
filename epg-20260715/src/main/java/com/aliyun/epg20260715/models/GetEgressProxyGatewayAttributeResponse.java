// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class GetEgressProxyGatewayAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEgressProxyGatewayAttributeResponseBody body;

    public static GetEgressProxyGatewayAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEgressProxyGatewayAttributeResponse self = new GetEgressProxyGatewayAttributeResponse();
        return TeaModel.build(map, self);
    }

    public GetEgressProxyGatewayAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEgressProxyGatewayAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEgressProxyGatewayAttributeResponse setBody(GetEgressProxyGatewayAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEgressProxyGatewayAttributeResponseBody getBody() {
        return this.body;
    }

}
