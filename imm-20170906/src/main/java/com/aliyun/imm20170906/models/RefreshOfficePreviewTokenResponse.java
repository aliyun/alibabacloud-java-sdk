// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class RefreshOfficePreviewTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RefreshOfficePreviewTokenResponseBody body;

    public static RefreshOfficePreviewTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshOfficePreviewTokenResponse self = new RefreshOfficePreviewTokenResponse();
        return TeaModel.build(map, self);
    }

    public RefreshOfficePreviewTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefreshOfficePreviewTokenResponse setBody(RefreshOfficePreviewTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshOfficePreviewTokenResponseBody getBody() {
        return this.body;
    }

}
