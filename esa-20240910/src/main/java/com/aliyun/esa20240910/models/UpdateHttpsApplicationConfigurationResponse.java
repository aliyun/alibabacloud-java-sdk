// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateHttpsApplicationConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateHttpsApplicationConfigurationResponseBody body;

    public static UpdateHttpsApplicationConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateHttpsApplicationConfigurationResponse self = new UpdateHttpsApplicationConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateHttpsApplicationConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateHttpsApplicationConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateHttpsApplicationConfigurationResponse setBody(UpdateHttpsApplicationConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateHttpsApplicationConfigurationResponseBody getBody() {
        return this.body;
    }

}
