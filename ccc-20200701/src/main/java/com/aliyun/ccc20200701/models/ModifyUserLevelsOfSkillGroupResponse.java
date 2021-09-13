// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ModifyUserLevelsOfSkillGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ModifyUserLevelsOfSkillGroupResponse setBody(ModifyUserLevelsOfSkillGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyUserLevelsOfSkillGroupResponseBody getBody() {
        return this.body;
    }

}
