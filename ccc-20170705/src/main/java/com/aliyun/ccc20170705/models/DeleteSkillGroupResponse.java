// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class DeleteSkillGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteSkillGroupResponse setBody(DeleteSkillGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSkillGroupResponseBody getBody() {
        return this.body;
    }

}
