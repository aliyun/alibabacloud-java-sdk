// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class RemovePermissionPolicyFromAccessConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemovePermissionPolicyFromAccessConfigurationResponseBody body;

    public static RemovePermissionPolicyFromAccessConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        RemovePermissionPolicyFromAccessConfigurationResponse self = new RemovePermissionPolicyFromAccessConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public RemovePermissionPolicyFromAccessConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemovePermissionPolicyFromAccessConfigurationResponse setBody(RemovePermissionPolicyFromAccessConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public RemovePermissionPolicyFromAccessConfigurationResponseBody getBody() {
        return this.body;
    }

}
