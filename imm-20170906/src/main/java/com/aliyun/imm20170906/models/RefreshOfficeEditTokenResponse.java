// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class RefreshOfficeEditTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RefreshOfficeEditTokenResponseBody body;

    public static RefreshOfficeEditTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshOfficeEditTokenResponse self = new RefreshOfficeEditTokenResponse();
        return TeaModel.build(map, self);
    }

    public RefreshOfficeEditTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefreshOfficeEditTokenResponse setBody(RefreshOfficeEditTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshOfficeEditTokenResponseBody getBody() {
        return this.body;
    }

}
