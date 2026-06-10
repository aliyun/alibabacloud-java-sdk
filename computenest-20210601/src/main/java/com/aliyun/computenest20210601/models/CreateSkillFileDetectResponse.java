// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class CreateSkillFileDetectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSkillFileDetectResponseBody body;

    public static CreateSkillFileDetectResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSkillFileDetectResponse self = new CreateSkillFileDetectResponse();
        return TeaModel.build(map, self);
    }

    public CreateSkillFileDetectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSkillFileDetectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSkillFileDetectResponse setBody(CreateSkillFileDetectResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSkillFileDetectResponseBody getBody() {
        return this.body;
    }

}
