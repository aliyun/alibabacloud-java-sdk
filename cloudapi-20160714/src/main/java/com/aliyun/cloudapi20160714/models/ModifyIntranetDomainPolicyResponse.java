// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyIntranetDomainPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyIntranetDomainPolicyResponseBody body;

    public static ModifyIntranetDomainPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyIntranetDomainPolicyResponse self = new ModifyIntranetDomainPolicyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyIntranetDomainPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyIntranetDomainPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyIntranetDomainPolicyResponse setBody(ModifyIntranetDomainPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyIntranetDomainPolicyResponseBody getBody() {
        return this.body;
    }

}
