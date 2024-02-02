// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class DeleteSkillGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSkillGroupResponseBody body;

    public static DeleteSkillGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSkillGroupResponse self = new DeleteSkillGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSkillGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSkillGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSkillGroupResponse setBody(DeleteSkillGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSkillGroupResponseBody getBody() {
        return this.body;
    }

}
