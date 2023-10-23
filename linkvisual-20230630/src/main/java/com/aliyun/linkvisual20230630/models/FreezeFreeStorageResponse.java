// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class FreezeFreeStorageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public FreezeFreeStorageResponseBody body;

    public static FreezeFreeStorageResponse build(java.util.Map<String, ?> map) throws Exception {
        FreezeFreeStorageResponse self = new FreezeFreeStorageResponse();
        return TeaModel.build(map, self);
    }

    public FreezeFreeStorageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FreezeFreeStorageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FreezeFreeStorageResponse setBody(FreezeFreeStorageResponseBody body) {
        this.body = body;
        return this;
    }
    public FreezeFreeStorageResponseBody getBody() {
        return this.body;
    }

}
