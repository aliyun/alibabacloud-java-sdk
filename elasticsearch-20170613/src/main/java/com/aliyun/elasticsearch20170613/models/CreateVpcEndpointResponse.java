// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CreateVpcEndpointResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateVpcEndpointResponseBody body;

    public static CreateVpcEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVpcEndpointResponse self = new CreateVpcEndpointResponse();
        return TeaModel.build(map, self);
    }

    public CreateVpcEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVpcEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVpcEndpointResponse setBody(CreateVpcEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVpcEndpointResponseBody getBody() {
        return this.body;
    }

}
