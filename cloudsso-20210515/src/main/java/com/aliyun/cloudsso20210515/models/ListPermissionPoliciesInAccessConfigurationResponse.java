// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListPermissionPoliciesInAccessConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListPermissionPoliciesInAccessConfigurationResponseBody body;

    public static ListPermissionPoliciesInAccessConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPermissionPoliciesInAccessConfigurationResponse self = new ListPermissionPoliciesInAccessConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public ListPermissionPoliciesInAccessConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPermissionPoliciesInAccessConfigurationResponse setBody(ListPermissionPoliciesInAccessConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPermissionPoliciesInAccessConfigurationResponseBody getBody() {
        return this.body;
    }

}
