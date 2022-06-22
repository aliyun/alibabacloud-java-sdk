// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class DeletePermanentTopologyNodesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeletePermanentTopologyNodesResponseBody body;

    public static DeletePermanentTopologyNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePermanentTopologyNodesResponse self = new DeletePermanentTopologyNodesResponse();
        return TeaModel.build(map, self);
    }

    public DeletePermanentTopologyNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePermanentTopologyNodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePermanentTopologyNodesResponse setBody(DeletePermanentTopologyNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePermanentTopologyNodesResponseBody getBody() {
        return this.body;
    }

}
