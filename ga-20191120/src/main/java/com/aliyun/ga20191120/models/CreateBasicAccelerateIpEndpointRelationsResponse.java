// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateBasicAccelerateIpEndpointRelationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateBasicAccelerateIpEndpointRelationsResponseBody body;

    public static CreateBasicAccelerateIpEndpointRelationsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBasicAccelerateIpEndpointRelationsResponse self = new CreateBasicAccelerateIpEndpointRelationsResponse();
        return TeaModel.build(map, self);
    }

    public CreateBasicAccelerateIpEndpointRelationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBasicAccelerateIpEndpointRelationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateBasicAccelerateIpEndpointRelationsResponse setBody(CreateBasicAccelerateIpEndpointRelationsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBasicAccelerateIpEndpointRelationsResponseBody getBody() {
        return this.body;
    }

}
