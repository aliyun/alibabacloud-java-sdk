// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class RefreshStudioAppTokenOpenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public RefreshStudioAppTokenOpenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RefreshStudioAppTokenOpenResponse setBody(RefreshStudioAppTokenOpenResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshStudioAppTokenOpenResponseBody getBody() {
        return this.body;
    }

}
