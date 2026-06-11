// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class UpdateSkillScopeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSkillScopeResponseBody body;

    public static UpdateSkillScopeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSkillScopeResponse self = new UpdateSkillScopeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSkillScopeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSkillScopeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSkillScopeResponse setBody(UpdateSkillScopeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSkillScopeResponseBody getBody() {
        return this.body;
    }

}
