// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateBasicAccelerateIpEndpointRelationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateBasicAccelerateIpEndpointRelationResponseBody body;

    public static CreateBasicAccelerateIpEndpointRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBasicAccelerateIpEndpointRelationResponse self = new CreateBasicAccelerateIpEndpointRelationResponse();
        return TeaModel.build(map, self);
    }

    public CreateBasicAccelerateIpEndpointRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBasicAccelerateIpEndpointRelationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateBasicAccelerateIpEndpointRelationResponse setBody(CreateBasicAccelerateIpEndpointRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBasicAccelerateIpEndpointRelationResponseBody getBody() {
        return this.body;
    }

}
