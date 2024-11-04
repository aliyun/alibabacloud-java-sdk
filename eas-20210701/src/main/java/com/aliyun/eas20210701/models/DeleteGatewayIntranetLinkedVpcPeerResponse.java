// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DeleteGatewayIntranetLinkedVpcPeerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteGatewayIntranetLinkedVpcPeerResponseBody body;

    public static DeleteGatewayIntranetLinkedVpcPeerResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGatewayIntranetLinkedVpcPeerResponse self = new DeleteGatewayIntranetLinkedVpcPeerResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGatewayIntranetLinkedVpcPeerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGatewayIntranetLinkedVpcPeerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteGatewayIntranetLinkedVpcPeerResponse setBody(DeleteGatewayIntranetLinkedVpcPeerResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGatewayIntranetLinkedVpcPeerResponseBody getBody() {
        return this.body;
    }

}
