// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class BindDBResourceGroupWithRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BindDBResourceGroupWithRoleResponseBody body;

    public static BindDBResourceGroupWithRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        BindDBResourceGroupWithRoleResponse self = new BindDBResourceGroupWithRoleResponse();
        return TeaModel.build(map, self);
    }

    public BindDBResourceGroupWithRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindDBResourceGroupWithRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindDBResourceGroupWithRoleResponse setBody(BindDBResourceGroupWithRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public BindDBResourceGroupWithRoleResponseBody getBody() {
        return this.body;
    }

}
