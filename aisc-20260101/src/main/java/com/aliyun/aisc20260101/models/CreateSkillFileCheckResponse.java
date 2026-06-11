// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisc20260101.models;

import com.aliyun.tea.*;

public class CreateSkillFileCheckResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSkillFileCheckResponseBody body;

    public static CreateSkillFileCheckResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSkillFileCheckResponse self = new CreateSkillFileCheckResponse();
        return TeaModel.build(map, self);
    }

    public CreateSkillFileCheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSkillFileCheckResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSkillFileCheckResponse setBody(CreateSkillFileCheckResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSkillFileCheckResponseBody getBody() {
        return this.body;
    }

}
