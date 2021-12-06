// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class AddPermissionPolicyToAccessConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public AddPermissionPolicyToAccessConfigurationResponse setBody(AddPermissionPolicyToAccessConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public AddPermissionPolicyToAccessConfigurationResponseBody getBody() {
        return this.body;
    }

}
