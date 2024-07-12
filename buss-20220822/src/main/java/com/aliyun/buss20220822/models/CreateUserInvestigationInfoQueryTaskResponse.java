// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.buss20220822.models;

import com.aliyun.tea.*;

public class CreateUserInvestigationInfoQueryTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateUserInvestigationInfoQueryTaskResponseBody body;

    public static CreateUserInvestigationInfoQueryTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUserInvestigationInfoQueryTaskResponse self = new CreateUserInvestigationInfoQueryTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateUserInvestigationInfoQueryTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateUserInvestigationInfoQueryTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateUserInvestigationInfoQueryTaskResponse setBody(CreateUserInvestigationInfoQueryTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateUserInvestigationInfoQueryTaskResponseBody getBody() {
        return this.body;
    }

}
