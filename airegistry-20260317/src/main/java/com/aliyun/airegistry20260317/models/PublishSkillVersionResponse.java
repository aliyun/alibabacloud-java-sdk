// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class PublishSkillVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PublishSkillVersionResponseBody body;

    public static PublishSkillVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishSkillVersionResponse self = new PublishSkillVersionResponse();
        return TeaModel.build(map, self);
    }

    public PublishSkillVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishSkillVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PublishSkillVersionResponse setBody(PublishSkillVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishSkillVersionResponseBody getBody() {
        return this.body;
    }

}
