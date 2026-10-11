// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class DeleteEgressProxyGatewayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteEgressProxyGatewayResponseBody body;

    public static DeleteEgressProxyGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEgressProxyGatewayResponse self = new DeleteEgressProxyGatewayResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEgressProxyGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEgressProxyGatewayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEgressProxyGatewayResponse setBody(DeleteEgressProxyGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEgressProxyGatewayResponseBody getBody() {
        return this.body;
    }

}
