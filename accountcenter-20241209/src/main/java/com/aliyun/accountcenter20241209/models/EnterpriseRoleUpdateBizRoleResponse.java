// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseRoleUpdateBizRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnterpriseRoleUpdateBizRoleResponseBody body;

    public static EnterpriseRoleUpdateBizRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseRoleUpdateBizRoleResponse self = new EnterpriseRoleUpdateBizRoleResponse();
        return TeaModel.build(map, self);
    }

    public EnterpriseRoleUpdateBizRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnterpriseRoleUpdateBizRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnterpriseRoleUpdateBizRoleResponse setBody(EnterpriseRoleUpdateBizRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public EnterpriseRoleUpdateBizRoleResponseBody getBody() {
        return this.body;
    }

}
