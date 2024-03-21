// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class StopDesktopsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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
