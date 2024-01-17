// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class RefreshAccessUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RefreshAccessUrlResponseBody body;

    public static RefreshAccessUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshAccessUrlResponse self = new RefreshAccessUrlResponse();
        return TeaModel.build(map, self);
    }

    public RefreshAccessUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefreshAccessUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RefreshAccessUrlResponse setBody(RefreshAccessUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshAccessUrlResponseBody getBody() {
        return this.body;
    }

}
