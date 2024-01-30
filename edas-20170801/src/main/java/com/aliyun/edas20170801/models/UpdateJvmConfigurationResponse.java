// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateJvmConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateJvmConfigurationResponseBody body;

    public static UpdateJvmConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateJvmConfigurationResponse self = new UpdateJvmConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateJvmConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateJvmConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateJvmConfigurationResponse setBody(UpdateJvmConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateJvmConfigurationResponseBody getBody() {
        return this.body;
    }

}
