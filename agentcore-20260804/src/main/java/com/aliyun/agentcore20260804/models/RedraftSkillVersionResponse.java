// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class RedraftSkillVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RedraftSkillVersionResponseBody body;

    public static RedraftSkillVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        RedraftSkillVersionResponse self = new RedraftSkillVersionResponse();
        return TeaModel.build(map, self);
    }

    public RedraftSkillVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RedraftSkillVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RedraftSkillVersionResponse setBody(RedraftSkillVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public RedraftSkillVersionResponseBody getBody() {
        return this.body;
    }

}
