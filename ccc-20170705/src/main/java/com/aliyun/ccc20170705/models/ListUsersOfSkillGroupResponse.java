// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListUsersOfSkillGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListUsersOfSkillGroupResponseBody body;

    public static ListUsersOfSkillGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUsersOfSkillGroupResponse self = new ListUsersOfSkillGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListUsersOfSkillGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUsersOfSkillGroupResponse setBody(ListUsersOfSkillGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUsersOfSkillGroupResponseBody getBody() {
        return this.body;
    }

}
