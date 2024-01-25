// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateServiceSafetyLockResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateServiceSafetyLockResponseBody body;

    public static UpdateServiceSafetyLockResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceSafetyLockResponse self = new UpdateServiceSafetyLockResponse();
        return TeaModel.build(map, self);
    }

    public UpdateServiceSafetyLockResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateServiceSafetyLockResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateServiceSafetyLockResponse setBody(UpdateServiceSafetyLockResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateServiceSafetyLockResponseBody getBody() {
        return this.body;
    }

}
