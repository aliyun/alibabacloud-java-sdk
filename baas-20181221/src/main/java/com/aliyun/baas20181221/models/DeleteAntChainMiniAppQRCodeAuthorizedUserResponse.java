// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DeleteAntChainMiniAppQRCodeAuthorizedUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAntChainMiniAppQRCodeAuthorizedUserResponseBody body;

    public static DeleteAntChainMiniAppQRCodeAuthorizedUserResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAntChainMiniAppQRCodeAuthorizedUserResponse self = new DeleteAntChainMiniAppQRCodeAuthorizedUserResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAntChainMiniAppQRCodeAuthorizedUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAntChainMiniAppQRCodeAuthorizedUserResponse setBody(DeleteAntChainMiniAppQRCodeAuthorizedUserResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAntChainMiniAppQRCodeAuthorizedUserResponseBody getBody() {
        return this.body;
    }

}
