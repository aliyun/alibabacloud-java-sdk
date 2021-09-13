// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class RemoveUsersFromSkillGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveUsersFromSkillGroupResponseBody body;

    public static RemoveUsersFromSkillGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveUsersFromSkillGroupResponse self = new RemoveUsersFromSkillGroupResponse();
        return TeaModel.build(map, self);
    }

    public RemoveUsersFromSkillGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveUsersFromSkillGroupResponse setBody(RemoveUsersFromSkillGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveUsersFromSkillGroupResponseBody getBody() {
        return this.body;
    }

}
