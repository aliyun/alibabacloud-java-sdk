// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class UpdateApplicationConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateApplicationConfigurationResponseBody body;

    public static UpdateApplicationConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationConfigurationResponse self = new UpdateApplicationConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateApplicationConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateApplicationConfigurationResponse setBody(UpdateApplicationConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateApplicationConfigurationResponseBody getBody() {
        return this.body;
    }

}
