// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class CreateSkillGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSkillGroupResponseBody body;

    public static CreateSkillGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSkillGroupResponse self = new CreateSkillGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateSkillGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSkillGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSkillGroupResponse setBody(CreateSkillGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSkillGroupResponseBody getBody() {
        return this.body;
    }

}
