// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class StopHanaDatabaseAsyncResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StopHanaDatabaseAsyncResponseBody body;

    public static StopHanaDatabaseAsyncResponse build(java.util.Map<String, ?> map) throws Exception {
        StopHanaDatabaseAsyncResponse self = new StopHanaDatabaseAsyncResponse();
        return TeaModel.build(map, self);
    }

    public StopHanaDatabaseAsyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopHanaDatabaseAsyncResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopHanaDatabaseAsyncResponse setBody(StopHanaDatabaseAsyncResponseBody body) {
        this.body = body;
        return this;
    }
    public StopHanaDatabaseAsyncResponseBody getBody() {
        return this.body;
    }

}
