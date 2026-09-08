// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class SetIdentitySkillSecurityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetIdentitySkillSecurityResponseBody body;

    public static SetIdentitySkillSecurityResponse build(java.util.Map<String, ?> map) throws Exception {
        SetIdentitySkillSecurityResponse self = new SetIdentitySkillSecurityResponse();
        return TeaModel.build(map, self);
    }

    public SetIdentitySkillSecurityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetIdentitySkillSecurityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetIdentitySkillSecurityResponse setBody(SetIdentitySkillSecurityResponseBody body) {
        this.body = body;
        return this;
    }
    public SetIdentitySkillSecurityResponseBody getBody() {
        return this.body;
    }

}
