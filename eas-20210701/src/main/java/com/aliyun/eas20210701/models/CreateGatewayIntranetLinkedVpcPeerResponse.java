// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateGatewayIntranetLinkedVpcPeerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateGatewayIntranetLinkedVpcPeerResponseBody body;

    public static CreateGatewayIntranetLinkedVpcPeerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGatewayIntranetLinkedVpcPeerResponse self = new CreateGatewayIntranetLinkedVpcPeerResponse();
        return TeaModel.build(map, self);
    }

    public CreateGatewayIntranetLinkedVpcPeerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGatewayIntranetLinkedVpcPeerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateGatewayIntranetLinkedVpcPeerResponse setBody(CreateGatewayIntranetLinkedVpcPeerResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGatewayIntranetLinkedVpcPeerResponseBody getBody() {
        return this.body;
    }

}
