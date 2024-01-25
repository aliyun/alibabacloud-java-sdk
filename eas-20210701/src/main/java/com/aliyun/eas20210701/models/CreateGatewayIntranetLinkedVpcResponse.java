// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateGatewayIntranetLinkedVpcResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateGatewayIntranetLinkedVpcResponseBody body;

    public static CreateGatewayIntranetLinkedVpcResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGatewayIntranetLinkedVpcResponse self = new CreateGatewayIntranetLinkedVpcResponse();
        return TeaModel.build(map, self);
    }

    public CreateGatewayIntranetLinkedVpcResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGatewayIntranetLinkedVpcResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateGatewayIntranetLinkedVpcResponse setBody(CreateGatewayIntranetLinkedVpcResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGatewayIntranetLinkedVpcResponseBody getBody() {
        return this.body;
    }

}
