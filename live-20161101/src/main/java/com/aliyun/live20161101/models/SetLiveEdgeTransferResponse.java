// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetLiveEdgeTransferResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SetLiveEdgeTransferResponseBody body;

    public static SetLiveEdgeTransferResponse build(java.util.Map<String, ?> map) throws Exception {
        SetLiveEdgeTransferResponse self = new SetLiveEdgeTransferResponse();
        return TeaModel.build(map, self);
    }

    public SetLiveEdgeTransferResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetLiveEdgeTransferResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetLiveEdgeTransferResponse setBody(SetLiveEdgeTransferResponseBody body) {
        this.body = body;
        return this;
    }
    public SetLiveEdgeTransferResponseBody getBody() {
        return this.body;
    }

}
