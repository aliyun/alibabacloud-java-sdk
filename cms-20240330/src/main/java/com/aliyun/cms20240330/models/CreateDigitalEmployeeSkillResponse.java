// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateDigitalEmployeeSkillResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDigitalEmployeeSkillResponseBody body;

    public static CreateDigitalEmployeeSkillResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDigitalEmployeeSkillResponse self = new CreateDigitalEmployeeSkillResponse();
        return TeaModel.build(map, self);
    }

    public CreateDigitalEmployeeSkillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDigitalEmployeeSkillResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDigitalEmployeeSkillResponse setBody(CreateDigitalEmployeeSkillResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDigitalEmployeeSkillResponseBody getBody() {
        return this.body;
    }

}
