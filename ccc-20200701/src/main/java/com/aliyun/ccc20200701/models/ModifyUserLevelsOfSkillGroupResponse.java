// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ModifyUserLevelsOfSkillGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyUserLevelsOfSkillGroupResponseBody body;

    public static ModifyUserLevelsOfSkillGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserLevelsOfSkillGroupResponse self = new ModifyUserLevelsOfSkillGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModifyUserLevelsOfSkillGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyUserLevelsOfSkillGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyUserLevelsOfSkillGroupResponse setBody(ModifyUserLevelsOfSkillGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyUserLevelsOfSkillGroupResponseBody getBody() {
        return this.body;
    }

}
