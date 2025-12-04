// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class RemoveRspDomainServerHoldStatusForGatewayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveRspDomainServerHoldStatusForGatewayResponseBody body;

    public static RemoveRspDomainServerHoldStatusForGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveRspDomainServerHoldStatusForGatewayResponse self = new RemoveRspDomainServerHoldStatusForGatewayResponse();
        return TeaModel.build(map, self);
    }

    public RemoveRspDomainServerHoldStatusForGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveRspDomainServerHoldStatusForGatewayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveRspDomainServerHoldStatusForGatewayResponse setBody(RemoveRspDomainServerHoldStatusForGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveRspDomainServerHoldStatusForGatewayResponseBody getBody() {
        return this.body;
    }

}
