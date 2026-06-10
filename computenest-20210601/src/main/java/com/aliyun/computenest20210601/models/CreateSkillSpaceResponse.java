// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class CreateSkillSpaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSkillSpaceResponseBody body;

    public static CreateSkillSpaceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSkillSpaceResponse self = new CreateSkillSpaceResponse();
        return TeaModel.build(map, self);
    }

    public CreateSkillSpaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSkillSpaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSkillSpaceResponse setBody(CreateSkillSpaceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSkillSpaceResponseBody getBody() {
        return this.body;
    }

}
