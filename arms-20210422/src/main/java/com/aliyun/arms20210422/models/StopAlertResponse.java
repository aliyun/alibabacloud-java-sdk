// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class StopAlertResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopAlertResponseBody body;

    public static StopAlertResponse build(java.util.Map<String, ?> map) throws Exception {
        StopAlertResponse self = new StopAlertResponse();
        return TeaModel.build(map, self);
    }

    public StopAlertResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopAlertResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopAlertResponse setBody(StopAlertResponseBody body) {
        this.body = body;
        return this;
    }
    public StopAlertResponseBody getBody() {
        return this.body;
    }

}
