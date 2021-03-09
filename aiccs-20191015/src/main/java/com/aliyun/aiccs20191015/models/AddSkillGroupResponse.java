// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class AddSkillGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddSkillGroupResponseBody body;

    public static AddSkillGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AddSkillGroupResponse self = new AddSkillGroupResponse();
        return TeaModel.build(map, self);
    }

    public AddSkillGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddSkillGroupResponse setBody(AddSkillGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public AddSkillGroupResponseBody getBody() {
        return this.body;
    }

}
