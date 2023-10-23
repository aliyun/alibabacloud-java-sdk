// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class ConsumeFreeStorageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ConsumeFreeStorageResponseBody body;

    public static ConsumeFreeStorageResponse build(java.util.Map<String, ?> map) throws Exception {
        ConsumeFreeStorageResponse self = new ConsumeFreeStorageResponse();
        return TeaModel.build(map, self);
    }

    public ConsumeFreeStorageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConsumeFreeStorageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConsumeFreeStorageResponse setBody(ConsumeFreeStorageResponseBody body) {
        this.body = body;
        return this;
    }
    public ConsumeFreeStorageResponseBody getBody() {
        return this.body;
    }

}
