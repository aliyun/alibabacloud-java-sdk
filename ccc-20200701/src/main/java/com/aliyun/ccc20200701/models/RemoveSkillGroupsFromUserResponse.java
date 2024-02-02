// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class RemoveSkillGroupsFromUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveSkillGroupsFromUserResponseBody body;

    public static RemoveSkillGroupsFromUserResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveSkillGroupsFromUserResponse self = new RemoveSkillGroupsFromUserResponse();
        return TeaModel.build(map, self);
    }

    public RemoveSkillGroupsFromUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveSkillGroupsFromUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveSkillGroupsFromUserResponse setBody(RemoveSkillGroupsFromUserResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveSkillGroupsFromUserResponseBody getBody() {
        return this.body;
    }

}
