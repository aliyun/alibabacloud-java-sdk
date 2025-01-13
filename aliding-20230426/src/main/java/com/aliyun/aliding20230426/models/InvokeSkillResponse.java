// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class InvokeSkillResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InvokeSkillResponseBody body;

    public static InvokeSkillResponse build(java.util.Map<String, ?> map) throws Exception {
        InvokeSkillResponse self = new InvokeSkillResponse();
        return TeaModel.build(map, self);
    }

    public InvokeSkillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InvokeSkillResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InvokeSkillResponse setBody(InvokeSkillResponseBody body) {
        this.body = body;
        return this;
    }
    public InvokeSkillResponseBody getBody() {
        return this.body;
    }

}
