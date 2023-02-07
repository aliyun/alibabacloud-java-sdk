// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ListAgentBySkillGroupIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListAgentBySkillGroupIdResponseBody body;

    public static ListAgentBySkillGroupIdResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAgentBySkillGroupIdResponse self = new ListAgentBySkillGroupIdResponse();
        return TeaModel.build(map, self);
    }

    public ListAgentBySkillGroupIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAgentBySkillGroupIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAgentBySkillGroupIdResponse setBody(ListAgentBySkillGroupIdResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAgentBySkillGroupIdResponseBody getBody() {
        return this.body;
    }

}
