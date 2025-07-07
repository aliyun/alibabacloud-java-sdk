// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseRoleQueryBizRoleByPageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnterpriseRoleQueryBizRoleByPageResponseBody body;

    public static EnterpriseRoleQueryBizRoleByPageResponse build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseRoleQueryBizRoleByPageResponse self = new EnterpriseRoleQueryBizRoleByPageResponse();
        return TeaModel.build(map, self);
    }

    public EnterpriseRoleQueryBizRoleByPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnterpriseRoleQueryBizRoleByPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnterpriseRoleQueryBizRoleByPageResponse setBody(EnterpriseRoleQueryBizRoleByPageResponseBody body) {
        this.body = body;
        return this;
    }
    public EnterpriseRoleQueryBizRoleByPageResponseBody getBody() {
        return this.body;
    }

}
