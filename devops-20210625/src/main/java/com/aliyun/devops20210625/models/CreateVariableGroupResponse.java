// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateVariableGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateVariableGroupResponseBody body;

    public static CreateVariableGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVariableGroupResponse self = new CreateVariableGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateVariableGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVariableGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVariableGroupResponse setBody(CreateVariableGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVariableGroupResponseBody getBody() {
        return this.body;
    }

}
