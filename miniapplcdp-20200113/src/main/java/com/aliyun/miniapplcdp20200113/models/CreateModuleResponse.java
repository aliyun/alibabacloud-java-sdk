// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class CreateModuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateModuleResponseBody body;

    public static CreateModuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateModuleResponse self = new CreateModuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateModuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateModuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateModuleResponse setBody(CreateModuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateModuleResponseBody getBody() {
        return this.body;
    }

}
