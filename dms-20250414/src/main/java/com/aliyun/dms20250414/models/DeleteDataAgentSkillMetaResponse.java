// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DeleteDataAgentSkillMetaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDataAgentSkillMetaResponseBody body;

    public static DeleteDataAgentSkillMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataAgentSkillMetaResponse self = new DeleteDataAgentSkillMetaResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDataAgentSkillMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDataAgentSkillMetaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDataAgentSkillMetaResponse setBody(DeleteDataAgentSkillMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDataAgentSkillMetaResponseBody getBody() {
        return this.body;
    }

}
