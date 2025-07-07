// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseRoleCreateBizRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnterpriseRoleCreateBizRoleResponseBody body;

    public static EnterpriseRoleCreateBizRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseRoleCreateBizRoleResponse self = new EnterpriseRoleCreateBizRoleResponse();
        return TeaModel.build(map, self);
    }

    public EnterpriseRoleCreateBizRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnterpriseRoleCreateBizRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnterpriseRoleCreateBizRoleResponse setBody(EnterpriseRoleCreateBizRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public EnterpriseRoleCreateBizRoleResponseBody getBody() {
        return this.body;
    }

}
