// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class RemoveSkillGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveSkillGroupResponseBody body;

    public static RemoveSkillGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveSkillGroupResponse self = new RemoveSkillGroupResponse();
        return TeaModel.build(map, self);
    }

    public RemoveSkillGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveSkillGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveSkillGroupResponse setBody(RemoveSkillGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveSkillGroupResponseBody getBody() {
        return this.body;
    }

}
