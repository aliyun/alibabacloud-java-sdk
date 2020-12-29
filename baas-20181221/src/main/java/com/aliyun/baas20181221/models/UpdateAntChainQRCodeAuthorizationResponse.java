// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class UpdateAntChainQRCodeAuthorizationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public UpdateAntChainQRCodeAuthorizationResponse setBody(UpdateAntChainQRCodeAuthorizationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAntChainQRCodeAuthorizationResponseBody getBody() {
        return this.body;
    }

}
