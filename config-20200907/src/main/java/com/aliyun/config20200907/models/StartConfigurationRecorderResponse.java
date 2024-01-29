// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class StartConfigurationRecorderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartConfigurationRecorderResponseBody body;

    public static StartConfigurationRecorderResponse build(java.util.Map<String, ?> map) throws Exception {
        StartConfigurationRecorderResponse self = new StartConfigurationRecorderResponse();
        return TeaModel.build(map, self);
    }

    public StartConfigurationRecorderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartConfigurationRecorderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartConfigurationRecorderResponse setBody(StartConfigurationRecorderResponseBody body) {
        this.body = body;
        return this;
    }
    public StartConfigurationRecorderResponseBody getBody() {
        return this.body;
    }

}
