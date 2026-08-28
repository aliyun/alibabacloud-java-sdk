// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class DeleteSkillDraftResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSkillDraftResponseBody body;

    public static DeleteSkillDraftResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSkillDraftResponse self = new DeleteSkillDraftResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSkillDraftResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSkillDraftResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSkillDraftResponse setBody(DeleteSkillDraftResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSkillDraftResponseBody getBody() {
        return this.body;
    }

}
