// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class SubmitSkillVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitSkillVersionResponseBody body;

    public static SubmitSkillVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitSkillVersionResponse self = new SubmitSkillVersionResponse();
        return TeaModel.build(map, self);
    }

    public SubmitSkillVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitSkillVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitSkillVersionResponse setBody(SubmitSkillVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitSkillVersionResponseBody getBody() {
        return this.body;
    }

}
