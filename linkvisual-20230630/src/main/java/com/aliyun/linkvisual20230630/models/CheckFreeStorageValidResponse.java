// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class CheckFreeStorageValidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CheckFreeStorageValidResponseBody body;

    public static CheckFreeStorageValidResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckFreeStorageValidResponse self = new CheckFreeStorageValidResponse();
        return TeaModel.build(map, self);
    }

    public CheckFreeStorageValidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckFreeStorageValidResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckFreeStorageValidResponse setBody(CheckFreeStorageValidResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckFreeStorageValidResponseBody getBody() {
        return this.body;
    }

}
