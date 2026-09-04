// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DeleteAgentSkillResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAgentSkillResponseBody body;

    public static DeleteAgentSkillResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgentSkillResponse self = new DeleteAgentSkillResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAgentSkillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAgentSkillResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAgentSkillResponse setBody(DeleteAgentSkillResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAgentSkillResponseBody getBody() {
        return this.body;
    }

}
