// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ModifySkillLevelsOfUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifySkillLevelsOfUserResponseBody body;

    public static ModifySkillLevelsOfUserResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySkillLevelsOfUserResponse self = new ModifySkillLevelsOfUserResponse();
        return TeaModel.build(map, self);
    }

    public ModifySkillLevelsOfUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySkillLevelsOfUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySkillLevelsOfUserResponse setBody(ModifySkillLevelsOfUserResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySkillLevelsOfUserResponseBody getBody() {
        return this.body;
    }

}
