// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class SetIdentitySkillAuthResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetIdentitySkillAuthResponseBody body;

    public static SetIdentitySkillAuthResponse build(java.util.Map<String, ?> map) throws Exception {
        SetIdentitySkillAuthResponse self = new SetIdentitySkillAuthResponse();
        return TeaModel.build(map, self);
    }

    public SetIdentitySkillAuthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetIdentitySkillAuthResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetIdentitySkillAuthResponse setBody(SetIdentitySkillAuthResponseBody body) {
        this.body = body;
        return this;
    }
    public SetIdentitySkillAuthResponseBody getBody() {
        return this.body;
    }

}
