// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateHttpsBasicConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateHttpsBasicConfigurationResponseBody body;

    public static UpdateHttpsBasicConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateHttpsBasicConfigurationResponse self = new UpdateHttpsBasicConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateHttpsBasicConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateHttpsBasicConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateHttpsBasicConfigurationResponse setBody(UpdateHttpsBasicConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateHttpsBasicConfigurationResponseBody getBody() {
        return this.body;
    }

}
