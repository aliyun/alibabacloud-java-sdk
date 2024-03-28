// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class GetBasicAccelerateIpEndpointRelationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBasicAccelerateIpEndpointRelationResponseBody body;

    public static GetBasicAccelerateIpEndpointRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBasicAccelerateIpEndpointRelationResponse self = new GetBasicAccelerateIpEndpointRelationResponse();
        return TeaModel.build(map, self);
    }

    public GetBasicAccelerateIpEndpointRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBasicAccelerateIpEndpointRelationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBasicAccelerateIpEndpointRelationResponse setBody(GetBasicAccelerateIpEndpointRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBasicAccelerateIpEndpointRelationResponseBody getBody() {
        return this.body;
    }

}
