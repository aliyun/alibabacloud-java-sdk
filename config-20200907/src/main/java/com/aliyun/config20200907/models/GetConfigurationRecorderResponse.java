// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetConfigurationRecorderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetConfigurationRecorderResponseBody body;

    public static GetConfigurationRecorderResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConfigurationRecorderResponse self = new GetConfigurationRecorderResponse();
        return TeaModel.build(map, self);
    }

    public GetConfigurationRecorderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetConfigurationRecorderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetConfigurationRecorderResponse setBody(GetConfigurationRecorderResponseBody body) {
        this.body = body;
        return this;
    }
    public GetConfigurationRecorderResponseBody getBody() {
        return this.body;
    }

}
