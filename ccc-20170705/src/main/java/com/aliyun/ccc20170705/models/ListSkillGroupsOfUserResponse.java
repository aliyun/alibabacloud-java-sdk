// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListSkillGroupsOfUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSkillGroupsOfUserResponseBody body;

    public static ListSkillGroupsOfUserResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSkillGroupsOfUserResponse self = new ListSkillGroupsOfUserResponse();
        return TeaModel.build(map, self);
    }

    public ListSkillGroupsOfUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSkillGroupsOfUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSkillGroupsOfUserResponse setBody(ListSkillGroupsOfUserResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSkillGroupsOfUserResponseBody getBody() {
        return this.body;
    }

}
