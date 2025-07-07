// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseRoleQueryBizRoleDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnterpriseRoleQueryBizRoleDetailResponseBody body;

    public static EnterpriseRoleQueryBizRoleDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseRoleQueryBizRoleDetailResponse self = new EnterpriseRoleQueryBizRoleDetailResponse();
        return TeaModel.build(map, self);
    }

    public EnterpriseRoleQueryBizRoleDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnterpriseRoleQueryBizRoleDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnterpriseRoleQueryBizRoleDetailResponse setBody(EnterpriseRoleQueryBizRoleDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public EnterpriseRoleQueryBizRoleDetailResponseBody getBody() {
        return this.body;
    }

}
