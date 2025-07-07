// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseAccountQueryAccountGrantedRolesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnterpriseAccountQueryAccountGrantedRolesResponseBody body;

    public static EnterpriseAccountQueryAccountGrantedRolesResponse build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseAccountQueryAccountGrantedRolesResponse self = new EnterpriseAccountQueryAccountGrantedRolesResponse();
        return TeaModel.build(map, self);
    }

    public EnterpriseAccountQueryAccountGrantedRolesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnterpriseAccountQueryAccountGrantedRolesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnterpriseAccountQueryAccountGrantedRolesResponse setBody(EnterpriseAccountQueryAccountGrantedRolesResponseBody body) {
        this.body = body;
        return this;
    }
    public EnterpriseAccountQueryAccountGrantedRolesResponseBody getBody() {
        return this.body;
    }

}
