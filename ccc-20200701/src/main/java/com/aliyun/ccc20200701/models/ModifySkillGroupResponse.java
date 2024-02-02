// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ModifySkillGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifySkillGroupResponseBody body;

    public static ModifySkillGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySkillGroupResponse self = new ModifySkillGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModifySkillGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySkillGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySkillGroupResponse setBody(ModifySkillGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySkillGroupResponseBody getBody() {
        return this.body;
    }

}
