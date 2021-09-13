// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class AddSkillGroupsToUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddSkillGroupsToUserResponseBody body;

    public static AddSkillGroupsToUserResponse build(java.util.Map<String, ?> map) throws Exception {
        AddSkillGroupsToUserResponse self = new AddSkillGroupsToUserResponse();
        return TeaModel.build(map, self);
    }

    public AddSkillGroupsToUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddSkillGroupsToUserResponse setBody(AddSkillGroupsToUserResponseBody body) {
        this.body = body;
        return this;
    }
    public AddSkillGroupsToUserResponseBody getBody() {
        return this.body;
    }

}
