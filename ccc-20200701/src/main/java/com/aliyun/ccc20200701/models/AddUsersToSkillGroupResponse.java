// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class AddUsersToSkillGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddUsersToSkillGroupResponseBody body;

    public static AddUsersToSkillGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AddUsersToSkillGroupResponse self = new AddUsersToSkillGroupResponse();
        return TeaModel.build(map, self);
    }

    public AddUsersToSkillGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddUsersToSkillGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddUsersToSkillGroupResponse setBody(AddUsersToSkillGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public AddUsersToSkillGroupResponseBody getBody() {
        return this.body;
    }

}
