// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetUserProvisioningConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUserProvisioningConfigurationResponseBody body;

    public static GetUserProvisioningConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserProvisioningConfigurationResponse self = new GetUserProvisioningConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public GetUserProvisioningConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserProvisioningConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserProvisioningConfigurationResponse setBody(GetUserProvisioningConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserProvisioningConfigurationResponseBody getBody() {
        return this.body;
    }

}
