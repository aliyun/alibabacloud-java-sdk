// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class CreateTenantSkillResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTenantSkillResponseBody body;

    public static CreateTenantSkillResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTenantSkillResponse self = new CreateTenantSkillResponse();
        return TeaModel.build(map, self);
    }

    public CreateTenantSkillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTenantSkillResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTenantSkillResponse setBody(CreateTenantSkillResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTenantSkillResponseBody getBody() {
        return this.body;
    }

}
