// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class StartStressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StartStressResponseBody body;

    public static StartStressResponse build(java.util.Map<String, ?> map) throws Exception {
        StartStressResponse self = new StartStressResponse();
        return TeaModel.build(map, self);
    }

    public StartStressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartStressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartStressResponse setBody(StartStressResponseBody body) {
        this.body = body;
        return this;
    }
    public StartStressResponseBody getBody() {
        return this.body;
    }

}
