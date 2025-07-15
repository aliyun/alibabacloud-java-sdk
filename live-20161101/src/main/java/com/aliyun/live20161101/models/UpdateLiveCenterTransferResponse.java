// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveCenterTransferResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateLiveCenterTransferResponseBody body;

    public static UpdateLiveCenterTransferResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveCenterTransferResponse self = new UpdateLiveCenterTransferResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLiveCenterTransferResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLiveCenterTransferResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLiveCenterTransferResponse setBody(UpdateLiveCenterTransferResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLiveCenterTransferResponseBody getBody() {
        return this.body;
    }

}
