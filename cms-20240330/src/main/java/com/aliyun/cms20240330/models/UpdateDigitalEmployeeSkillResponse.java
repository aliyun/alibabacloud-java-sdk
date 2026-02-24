// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateDigitalEmployeeSkillResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDigitalEmployeeSkillResponseBody body;

    public static UpdateDigitalEmployeeSkillResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDigitalEmployeeSkillResponse self = new UpdateDigitalEmployeeSkillResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDigitalEmployeeSkillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDigitalEmployeeSkillResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDigitalEmployeeSkillResponse setBody(UpdateDigitalEmployeeSkillResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDigitalEmployeeSkillResponseBody getBody() {
        return this.body;
    }

}
