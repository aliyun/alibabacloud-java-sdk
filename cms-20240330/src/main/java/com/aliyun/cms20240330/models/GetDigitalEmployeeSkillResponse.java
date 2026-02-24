// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetDigitalEmployeeSkillResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDigitalEmployeeSkillResponseBody body;

    public static GetDigitalEmployeeSkillResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDigitalEmployeeSkillResponse self = new GetDigitalEmployeeSkillResponse();
        return TeaModel.build(map, self);
    }

    public GetDigitalEmployeeSkillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDigitalEmployeeSkillResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDigitalEmployeeSkillResponse setBody(GetDigitalEmployeeSkillResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDigitalEmployeeSkillResponseBody getBody() {
        return this.body;
    }

}
