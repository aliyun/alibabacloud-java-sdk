// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class RemoveAgentFromSkillGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveAgentFromSkillGroupResponseBody body;

    public static RemoveAgentFromSkillGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveAgentFromSkillGroupResponse self = new RemoveAgentFromSkillGroupResponse();
        return TeaModel.build(map, self);
    }

    public RemoveAgentFromSkillGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveAgentFromSkillGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveAgentFromSkillGroupResponse setBody(RemoveAgentFromSkillGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveAgentFromSkillGroupResponseBody getBody() {
        return this.body;
    }

}
