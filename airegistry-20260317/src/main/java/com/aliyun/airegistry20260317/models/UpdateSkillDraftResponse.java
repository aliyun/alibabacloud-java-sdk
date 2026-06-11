// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class UpdateSkillDraftResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSkillDraftResponseBody body;

    public static UpdateSkillDraftResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSkillDraftResponse self = new UpdateSkillDraftResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSkillDraftResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSkillDraftResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSkillDraftResponse setBody(UpdateSkillDraftResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSkillDraftResponseBody getBody() {
        return this.body;
    }

}
