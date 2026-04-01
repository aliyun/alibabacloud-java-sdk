// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteNetworkPeerConnectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteNetworkPeerConnectionResponseBody body;

    public static DeleteNetworkPeerConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkPeerConnectionResponse self = new DeleteNetworkPeerConnectionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkPeerConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteNetworkPeerConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteNetworkPeerConnectionResponse setBody(DeleteNetworkPeerConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteNetworkPeerConnectionResponseBody getBody() {
        return this.body;
    }

}
