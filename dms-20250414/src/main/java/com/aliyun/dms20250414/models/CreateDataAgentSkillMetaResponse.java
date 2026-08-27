// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class CreateDataAgentSkillMetaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDataAgentSkillMetaResponseBody body;

    public static CreateDataAgentSkillMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataAgentSkillMetaResponse self = new CreateDataAgentSkillMetaResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataAgentSkillMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDataAgentSkillMetaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDataAgentSkillMetaResponse setBody(CreateDataAgentSkillMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDataAgentSkillMetaResponseBody getBody() {
        return this.body;
    }

}
