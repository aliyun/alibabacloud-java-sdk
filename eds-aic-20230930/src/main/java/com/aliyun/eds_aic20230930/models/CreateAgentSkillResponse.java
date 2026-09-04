// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreateAgentSkillResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAgentSkillResponseBody body;

    public static CreateAgentSkillResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentSkillResponse self = new CreateAgentSkillResponse();
        return TeaModel.build(map, self);
    }

    public CreateAgentSkillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAgentSkillResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAgentSkillResponse setBody(CreateAgentSkillResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAgentSkillResponseBody getBody() {
        return this.body;
    }

}
