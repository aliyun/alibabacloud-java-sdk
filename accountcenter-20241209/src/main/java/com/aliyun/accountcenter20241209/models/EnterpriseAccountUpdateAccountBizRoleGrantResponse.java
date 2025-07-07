// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseAccountUpdateAccountBizRoleGrantResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnterpriseAccountUpdateAccountBizRoleGrantResponseBody body;

    public static EnterpriseAccountUpdateAccountBizRoleGrantResponse build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseAccountUpdateAccountBizRoleGrantResponse self = new EnterpriseAccountUpdateAccountBizRoleGrantResponse();
        return TeaModel.build(map, self);
    }

    public EnterpriseAccountUpdateAccountBizRoleGrantResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnterpriseAccountUpdateAccountBizRoleGrantResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnterpriseAccountUpdateAccountBizRoleGrantResponse setBody(EnterpriseAccountUpdateAccountBizRoleGrantResponseBody body) {
        this.body = body;
        return this;
    }
    public EnterpriseAccountUpdateAccountBizRoleGrantResponseBody getBody() {
        return this.body;
    }

}
