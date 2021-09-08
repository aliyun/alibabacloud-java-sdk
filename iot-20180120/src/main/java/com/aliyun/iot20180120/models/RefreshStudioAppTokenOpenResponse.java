// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class RefreshStudioAppTokenOpenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RefreshStudioAppTokenOpenResponseBody body;

    public static RefreshStudioAppTokenOpenResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshStudioAppTokenOpenResponse self = new RefreshStudioAppTokenOpenResponse();
        return TeaModel.build(map, self);
    }

    public RefreshStudioAppTokenOpenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefreshStudioAppTokenOpenResponse setBody(RefreshStudioAppTokenOpenResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshStudioAppTokenOpenResponseBody getBody() {
        return this.body;
    }

}
