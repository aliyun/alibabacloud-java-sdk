// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class AddNumbersToSkillGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddNumbersToSkillGroupResponseBody body;

    public static AddNumbersToSkillGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AddNumbersToSkillGroupResponse self = new AddNumbersToSkillGroupResponse();
        return TeaModel.build(map, self);
    }

    public AddNumbersToSkillGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddNumbersToSkillGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddNumbersToSkillGroupResponse setBody(AddNumbersToSkillGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public AddNumbersToSkillGroupResponseBody getBody() {
        return this.body;
    }

}
