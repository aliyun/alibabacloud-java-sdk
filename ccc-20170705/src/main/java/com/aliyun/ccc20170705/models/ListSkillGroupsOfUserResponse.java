// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListSkillGroupsOfUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListSkillGroupsOfUserResponse setBody(ListSkillGroupsOfUserResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSkillGroupsOfUserResponseBody getBody() {
        return this.body;
    }

}
