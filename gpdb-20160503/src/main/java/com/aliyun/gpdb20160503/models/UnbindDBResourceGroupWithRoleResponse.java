// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class UnbindDBResourceGroupWithRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnbindDBResourceGroupWithRoleResponseBody body;

    public static UnbindDBResourceGroupWithRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindDBResourceGroupWithRoleResponse self = new UnbindDBResourceGroupWithRoleResponse();
        return TeaModel.build(map, self);
    }

    public UnbindDBResourceGroupWithRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindDBResourceGroupWithRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnbindDBResourceGroupWithRoleResponse setBody(UnbindDBResourceGroupWithRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindDBResourceGroupWithRoleResponseBody getBody() {
        return this.body;
    }

}
