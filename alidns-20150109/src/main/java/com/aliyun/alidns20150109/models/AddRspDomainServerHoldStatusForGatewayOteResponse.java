// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddRspDomainServerHoldStatusForGatewayOteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddRspDomainServerHoldStatusForGatewayOteResponseBody body;

    public static AddRspDomainServerHoldStatusForGatewayOteResponse build(java.util.Map<String, ?> map) throws Exception {
        AddRspDomainServerHoldStatusForGatewayOteResponse self = new AddRspDomainServerHoldStatusForGatewayOteResponse();
        return TeaModel.build(map, self);
    }

    public AddRspDomainServerHoldStatusForGatewayOteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddRspDomainServerHoldStatusForGatewayOteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddRspDomainServerHoldStatusForGatewayOteResponse setBody(AddRspDomainServerHoldStatusForGatewayOteResponseBody body) {
        this.body = body;
        return this;
    }
    public AddRspDomainServerHoldStatusForGatewayOteResponseBody getBody() {
        return this.body;
    }

}
