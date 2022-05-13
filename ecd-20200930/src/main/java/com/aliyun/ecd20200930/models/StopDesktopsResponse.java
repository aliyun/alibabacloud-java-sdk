// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class StopDesktopsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StopDesktopsResponseBody body;

    public static StopDesktopsResponse build(java.util.Map<String, ?> map) throws Exception {
        StopDesktopsResponse self = new StopDesktopsResponse();
        return TeaModel.build(map, self);
    }

    public StopDesktopsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopDesktopsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopDesktopsResponse setBody(StopDesktopsResponseBody body) {
        this.body = body;
        return this;
    }
    public StopDesktopsResponseBody getBody() {
        return this.body;
    }

}
