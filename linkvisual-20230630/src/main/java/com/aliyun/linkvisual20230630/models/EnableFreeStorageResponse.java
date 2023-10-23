// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class EnableFreeStorageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EnableFreeStorageResponseBody body;

    public static EnableFreeStorageResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableFreeStorageResponse self = new EnableFreeStorageResponse();
        return TeaModel.build(map, self);
    }

    public EnableFreeStorageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableFreeStorageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableFreeStorageResponse setBody(EnableFreeStorageResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableFreeStorageResponseBody getBody() {
        return this.body;
    }

}
