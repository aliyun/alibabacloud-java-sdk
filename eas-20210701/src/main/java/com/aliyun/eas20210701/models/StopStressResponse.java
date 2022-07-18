// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class StopStressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StopStressResponseBody body;

    public static StopStressResponse build(java.util.Map<String, ?> map) throws Exception {
        StopStressResponse self = new StopStressResponse();
        return TeaModel.build(map, self);
    }

    public StopStressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopStressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopStressResponse setBody(StopStressResponseBody body) {
        this.body = body;
        return this;
    }
    public StopStressResponseBody getBody() {
        return this.body;
    }

}
