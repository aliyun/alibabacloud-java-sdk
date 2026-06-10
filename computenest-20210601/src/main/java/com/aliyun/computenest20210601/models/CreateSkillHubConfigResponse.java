// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class CreateSkillHubConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSkillHubConfigResponseBody body;

    public static CreateSkillHubConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSkillHubConfigResponse self = new CreateSkillHubConfigResponse();
        return TeaModel.build(map, self);
    }

    public CreateSkillHubConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSkillHubConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSkillHubConfigResponse setBody(CreateSkillHubConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSkillHubConfigResponseBody getBody() {
        return this.body;
    }

}
