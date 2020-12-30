// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListTrunksOfSkillGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListTrunksOfSkillGroupResponseBody body;

    public static ListTrunksOfSkillGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTrunksOfSkillGroupResponse self = new ListTrunksOfSkillGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListTrunksOfSkillGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTrunksOfSkillGroupResponse setBody(ListTrunksOfSkillGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTrunksOfSkillGroupResponseBody getBody() {
        return this.body;
    }

}
