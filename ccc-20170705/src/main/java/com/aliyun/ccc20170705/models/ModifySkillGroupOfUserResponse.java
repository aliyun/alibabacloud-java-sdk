// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ModifySkillGroupOfUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifySkillGroupOfUserResponseBody body;

    public static ModifySkillGroupOfUserResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySkillGroupOfUserResponse self = new ModifySkillGroupOfUserResponse();
        return TeaModel.build(map, self);
    }

    public ModifySkillGroupOfUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySkillGroupOfUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySkillGroupOfUserResponse setBody(ModifySkillGroupOfUserResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySkillGroupOfUserResponseBody getBody() {
        return this.body;
    }

}
