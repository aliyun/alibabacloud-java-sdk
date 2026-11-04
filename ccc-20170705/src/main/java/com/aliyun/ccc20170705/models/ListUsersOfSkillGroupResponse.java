// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListUsersOfSkillGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListUsersOfSkillGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUsersOfSkillGroupResponse setBody(ListUsersOfSkillGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUsersOfSkillGroupResponseBody getBody() {
        return this.body;
    }

}
