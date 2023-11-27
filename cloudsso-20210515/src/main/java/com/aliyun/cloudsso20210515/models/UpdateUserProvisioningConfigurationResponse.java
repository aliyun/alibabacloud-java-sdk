// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class UpdateUserProvisioningConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateUserProvisioningConfigurationResponseBody body;

    public static UpdateUserProvisioningConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserProvisioningConfigurationResponse self = new UpdateUserProvisioningConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateUserProvisioningConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateUserProvisioningConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateUserProvisioningConfigurationResponse setBody(UpdateUserProvisioningConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateUserProvisioningConfigurationResponseBody getBody() {
        return this.body;
    }

}
