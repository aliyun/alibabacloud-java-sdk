// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class StopConfigurationRecorderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopConfigurationRecorderResponseBody body;

    public static StopConfigurationRecorderResponse build(java.util.Map<String, ?> map) throws Exception {
        StopConfigurationRecorderResponse self = new StopConfigurationRecorderResponse();
        return TeaModel.build(map, self);
    }

    public StopConfigurationRecorderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopConfigurationRecorderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopConfigurationRecorderResponse setBody(StopConfigurationRecorderResponseBody body) {
        this.body = body;
        return this;
    }
    public StopConfigurationRecorderResponseBody getBody() {
        return this.body;
    }

}
