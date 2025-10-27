// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreatePrivateDnsEndpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePrivateDnsEndpointResponseBody body;

    public static CreatePrivateDnsEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePrivateDnsEndpointResponse self = new CreatePrivateDnsEndpointResponse();
        return TeaModel.build(map, self);
    }

    public CreatePrivateDnsEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePrivateDnsEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePrivateDnsEndpointResponse setBody(CreatePrivateDnsEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePrivateDnsEndpointResponseBody getBody() {
        return this.body;
    }

}
