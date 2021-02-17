// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class RefreshWebofficeTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RefreshWebofficeTokenResponseBody body;

    public static RefreshWebofficeTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshWebofficeTokenResponse self = new RefreshWebofficeTokenResponse();
        return TeaModel.build(map, self);
    }

    public RefreshWebofficeTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefreshWebofficeTokenResponse setBody(RefreshWebofficeTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshWebofficeTokenResponseBody getBody() {
        return this.body;
    }

}
