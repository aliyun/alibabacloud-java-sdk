// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class OnlineSkillResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OnlineSkillResponseBody body;

    public static OnlineSkillResponse build(java.util.Map<String, ?> map) throws Exception {
        OnlineSkillResponse self = new OnlineSkillResponse();
        return TeaModel.build(map, self);
    }

    public OnlineSkillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnlineSkillResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OnlineSkillResponse setBody(OnlineSkillResponseBody body) {
        this.body = body;
        return this;
    }
    public OnlineSkillResponseBody getBody() {
        return this.body;
    }

}
