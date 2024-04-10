// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateInstanceVpcEndpointLinkedVpcResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateInstanceVpcEndpointLinkedVpcResponseBody body;

    public static CreateInstanceVpcEndpointLinkedVpcResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceVpcEndpointLinkedVpcResponse self = new CreateInstanceVpcEndpointLinkedVpcResponse();
        return TeaModel.build(map, self);
    }

    public CreateInstanceVpcEndpointLinkedVpcResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateInstanceVpcEndpointLinkedVpcResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateInstanceVpcEndpointLinkedVpcResponse setBody(CreateInstanceVpcEndpointLinkedVpcResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateInstanceVpcEndpointLinkedVpcResponseBody getBody() {
        return this.body;
    }

}
