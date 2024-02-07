// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListPermissionPoliciesInAccessConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListPermissionPoliciesInAccessConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPermissionPoliciesInAccessConfigurationResponse setBody(ListPermissionPoliciesInAccessConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPermissionPoliciesInAccessConfigurationResponseBody getBody() {
        return this.body;
    }

}
