// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class CreateSkillGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSkillGroupResponseBody body;

    public static CreateSkillGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSkillGroupResponse self = new CreateSkillGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateSkillGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSkillGroupResponse setBody(CreateSkillGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSkillGroupResponseBody getBody() {
        return this.body;
    }

}
