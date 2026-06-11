// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class CreateSkillDraftResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSkillDraftResponseBody body;

    public static CreateSkillDraftResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSkillDraftResponse self = new CreateSkillDraftResponse();
        return TeaModel.build(map, self);
    }

    public CreateSkillDraftResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSkillDraftResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSkillDraftResponse setBody(CreateSkillDraftResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSkillDraftResponseBody getBody() {
        return this.body;
    }

}
