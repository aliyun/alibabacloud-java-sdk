// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UpdateConfigurationRecorderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateConfigurationRecorderResponseBody body;

    public static UpdateConfigurationRecorderResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateConfigurationRecorderResponse self = new UpdateConfigurationRecorderResponse();
        return TeaModel.build(map, self);
    }

    public UpdateConfigurationRecorderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateConfigurationRecorderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateConfigurationRecorderResponse setBody(UpdateConfigurationRecorderResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateConfigurationRecorderResponseBody getBody() {
        return this.body;
    }

}
