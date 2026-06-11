// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class ForcePublishSkillVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ForcePublishSkillVersionResponseBody body;

    public static ForcePublishSkillVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        ForcePublishSkillVersionResponse self = new ForcePublishSkillVersionResponse();
        return TeaModel.build(map, self);
    }

    public ForcePublishSkillVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ForcePublishSkillVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ForcePublishSkillVersionResponse setBody(ForcePublishSkillVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public ForcePublishSkillVersionResponseBody getBody() {
        return this.body;
    }

}
