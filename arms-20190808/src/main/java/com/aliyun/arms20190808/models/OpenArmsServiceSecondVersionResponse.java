// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class OpenArmsServiceSecondVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OpenArmsServiceSecondVersionResponseBody body;

    public static OpenArmsServiceSecondVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenArmsServiceSecondVersionResponse self = new OpenArmsServiceSecondVersionResponse();
        return TeaModel.build(map, self);
    }

    public OpenArmsServiceSecondVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenArmsServiceSecondVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenArmsServiceSecondVersionResponse setBody(OpenArmsServiceSecondVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenArmsServiceSecondVersionResponseBody getBody() {
        return this.body;
    }

}
