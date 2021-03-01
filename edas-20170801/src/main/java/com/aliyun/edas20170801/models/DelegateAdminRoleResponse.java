// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DelegateAdminRoleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DelegateAdminRoleResponseBody body;

    public static DelegateAdminRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        DelegateAdminRoleResponse self = new DelegateAdminRoleResponse();
        return TeaModel.build(map, self);
    }

    public DelegateAdminRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DelegateAdminRoleResponse setBody(DelegateAdminRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public DelegateAdminRoleResponseBody getBody() {
        return this.body;
    }

}
