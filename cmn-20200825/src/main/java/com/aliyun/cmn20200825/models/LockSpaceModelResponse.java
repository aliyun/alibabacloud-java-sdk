// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class LockSpaceModelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public LockSpaceModelResponseBody body;

    public static LockSpaceModelResponse build(java.util.Map<String, ?> map) throws Exception {
        LockSpaceModelResponse self = new LockSpaceModelResponse();
        return TeaModel.build(map, self);
    }

    public LockSpaceModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LockSpaceModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LockSpaceModelResponse setBody(LockSpaceModelResponseBody body) {
        this.body = body;
        return this;
    }
    public LockSpaceModelResponseBody getBody() {
        return this.body;
    }

}
