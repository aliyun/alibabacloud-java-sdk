// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveEdgeTransferResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLiveEdgeTransferResponseBody body;

    public static DeleteLiveEdgeTransferResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveEdgeTransferResponse self = new DeleteLiveEdgeTransferResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLiveEdgeTransferResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLiveEdgeTransferResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLiveEdgeTransferResponse setBody(DeleteLiveEdgeTransferResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLiveEdgeTransferResponseBody getBody() {
        return this.body;
    }

}
