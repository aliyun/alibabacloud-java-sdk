// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddRspDomainServerHoldStatusForGatewayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddRspDomainServerHoldStatusForGatewayResponseBody body;

    public static AddRspDomainServerHoldStatusForGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        AddRspDomainServerHoldStatusForGatewayResponse self = new AddRspDomainServerHoldStatusForGatewayResponse();
        return TeaModel.build(map, self);
    }

    public AddRspDomainServerHoldStatusForGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddRspDomainServerHoldStatusForGatewayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddRspDomainServerHoldStatusForGatewayResponse setBody(AddRspDomainServerHoldStatusForGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public AddRspDomainServerHoldStatusForGatewayResponseBody getBody() {
        return this.body;
    }

}
