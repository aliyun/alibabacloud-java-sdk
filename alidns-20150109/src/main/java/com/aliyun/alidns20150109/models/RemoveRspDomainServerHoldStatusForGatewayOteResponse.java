// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class RemoveRspDomainServerHoldStatusForGatewayOteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveRspDomainServerHoldStatusForGatewayOteResponseBody body;

    public static RemoveRspDomainServerHoldStatusForGatewayOteResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveRspDomainServerHoldStatusForGatewayOteResponse self = new RemoveRspDomainServerHoldStatusForGatewayOteResponse();
        return TeaModel.build(map, self);
    }

    public RemoveRspDomainServerHoldStatusForGatewayOteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveRspDomainServerHoldStatusForGatewayOteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveRspDomainServerHoldStatusForGatewayOteResponse setBody(RemoveRspDomainServerHoldStatusForGatewayOteResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveRspDomainServerHoldStatusForGatewayOteResponseBody getBody() {
        return this.body;
    }

}
