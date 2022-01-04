// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class RefreshUserSessionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RefreshUserSessionResponseBody body;

    public static RefreshUserSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshUserSessionResponse self = new RefreshUserSessionResponse();
        return TeaModel.build(map, self);
    }

    public RefreshUserSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefreshUserSessionResponse setBody(RefreshUserSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshUserSessionResponseBody getBody() {
        return this.body;
    }

}
