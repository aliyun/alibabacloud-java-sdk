// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class AddSkillGroupsToUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public AddSkillGroupsToUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddSkillGroupsToUserResponse setBody(AddSkillGroupsToUserResponseBody body) {
        this.body = body;
        return this;
    }
    public AddSkillGroupsToUserResponseBody getBody() {
        return this.body;
    }

}
