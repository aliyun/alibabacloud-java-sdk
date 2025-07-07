// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseRoleQueryAccountForRoleGrantByPageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnterpriseRoleQueryAccountForRoleGrantByPageResponseBody body;

    public static EnterpriseRoleQueryAccountForRoleGrantByPageResponse build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseRoleQueryAccountForRoleGrantByPageResponse self = new EnterpriseRoleQueryAccountForRoleGrantByPageResponse();
        return TeaModel.build(map, self);
    }

    public EnterpriseRoleQueryAccountForRoleGrantByPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnterpriseRoleQueryAccountForRoleGrantByPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnterpriseRoleQueryAccountForRoleGrantByPageResponse setBody(EnterpriseRoleQueryAccountForRoleGrantByPageResponseBody body) {
        this.body = body;
        return this;
    }
    public EnterpriseRoleQueryAccountForRoleGrantByPageResponseBody getBody() {
        return this.body;
    }

}
