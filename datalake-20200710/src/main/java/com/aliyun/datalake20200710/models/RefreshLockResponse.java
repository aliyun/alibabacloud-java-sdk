// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class RefreshLockResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RefreshLockResponseBody body;

    public static RefreshLockResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshLockResponse self = new RefreshLockResponse();
        return TeaModel.build(map, self);
    }

    public RefreshLockResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefreshLockResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RefreshLockResponse setBody(RefreshLockResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshLockResponseBody getBody() {
        return this.body;
    }

}
