// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class AddPermissionPolicyToAccessConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddPermissionPolicyToAccessConfigurationResponseBody body;

    public static AddPermissionPolicyToAccessConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        AddPermissionPolicyToAccessConfigurationResponse self = new AddPermissionPolicyToAccessConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public AddPermissionPolicyToAccessConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddPermissionPolicyToAccessConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddPermissionPolicyToAccessConfigurationResponse setBody(AddPermissionPolicyToAccessConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public AddPermissionPolicyToAccessConfigurationResponseBody getBody() {
        return this.body;
    }

}
