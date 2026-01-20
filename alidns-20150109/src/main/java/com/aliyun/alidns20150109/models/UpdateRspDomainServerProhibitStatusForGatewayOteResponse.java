// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateRspDomainServerProhibitStatusForGatewayOteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateRspDomainServerProhibitStatusForGatewayOteResponseBody body;

    public static UpdateRspDomainServerProhibitStatusForGatewayOteResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRspDomainServerProhibitStatusForGatewayOteResponse self = new UpdateRspDomainServerProhibitStatusForGatewayOteResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRspDomainServerProhibitStatusForGatewayOteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRspDomainServerProhibitStatusForGatewayOteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRspDomainServerProhibitStatusForGatewayOteResponse setBody(UpdateRspDomainServerProhibitStatusForGatewayOteResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRspDomainServerProhibitStatusForGatewayOteResponseBody getBody() {
        return this.body;
    }

}
