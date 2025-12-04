// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateRspDomainServerProhibitStatusForGatewayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateRspDomainServerProhibitStatusForGatewayResponseBody body;

    public static UpdateRspDomainServerProhibitStatusForGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRspDomainServerProhibitStatusForGatewayResponse self = new UpdateRspDomainServerProhibitStatusForGatewayResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRspDomainServerProhibitStatusForGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRspDomainServerProhibitStatusForGatewayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRspDomainServerProhibitStatusForGatewayResponse setBody(UpdateRspDomainServerProhibitStatusForGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRspDomainServerProhibitStatusForGatewayResponseBody getBody() {
        return this.body;
    }

}
