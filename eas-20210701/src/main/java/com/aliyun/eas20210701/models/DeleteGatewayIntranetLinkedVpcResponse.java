// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DeleteGatewayIntranetLinkedVpcResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteGatewayIntranetLinkedVpcResponseBody body;

    public static DeleteGatewayIntranetLinkedVpcResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGatewayIntranetLinkedVpcResponse self = new DeleteGatewayIntranetLinkedVpcResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGatewayIntranetLinkedVpcResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGatewayIntranetLinkedVpcResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteGatewayIntranetLinkedVpcResponse setBody(DeleteGatewayIntranetLinkedVpcResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGatewayIntranetLinkedVpcResponseBody getBody() {
        return this.body;
    }

}
