// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class UpdateAntChainQRCodeAuthorizationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAntChainQRCodeAuthorizationResponseBody body;

    public static UpdateAntChainQRCodeAuthorizationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAntChainQRCodeAuthorizationResponse self = new UpdateAntChainQRCodeAuthorizationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAntChainQRCodeAuthorizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAntChainQRCodeAuthorizationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAntChainQRCodeAuthorizationResponse setBody(UpdateAntChainQRCodeAuthorizationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAntChainQRCodeAuthorizationResponseBody getBody() {
        return this.body;
    }

}
