// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class UpdateEgressProxyGatewayAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateEgressProxyGatewayAttributeResponseBody body;

    public static UpdateEgressProxyGatewayAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEgressProxyGatewayAttributeResponse self = new UpdateEgressProxyGatewayAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEgressProxyGatewayAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEgressProxyGatewayAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateEgressProxyGatewayAttributeResponse setBody(UpdateEgressProxyGatewayAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEgressProxyGatewayAttributeResponseBody getBody() {
        return this.body;
    }

}
