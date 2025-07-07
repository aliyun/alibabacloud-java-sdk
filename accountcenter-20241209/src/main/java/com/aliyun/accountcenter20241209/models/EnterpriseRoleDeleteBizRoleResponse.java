// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseRoleDeleteBizRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnterpriseRoleDeleteBizRoleResponseBody body;

    public static EnterpriseRoleDeleteBizRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseRoleDeleteBizRoleResponse self = new EnterpriseRoleDeleteBizRoleResponse();
        return TeaModel.build(map, self);
    }

    public EnterpriseRoleDeleteBizRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnterpriseRoleDeleteBizRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnterpriseRoleDeleteBizRoleResponse setBody(EnterpriseRoleDeleteBizRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public EnterpriseRoleDeleteBizRoleResponseBody getBody() {
        return this.body;
    }

}
