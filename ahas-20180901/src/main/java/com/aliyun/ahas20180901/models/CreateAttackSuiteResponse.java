// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class CreateAttackSuiteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAttackSuiteResponseBody body;

    public static CreateAttackSuiteResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAttackSuiteResponse self = new CreateAttackSuiteResponse();
        return TeaModel.build(map, self);
    }

    public CreateAttackSuiteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAttackSuiteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAttackSuiteResponse setBody(CreateAttackSuiteResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAttackSuiteResponseBody getBody() {
        return this.body;
    }

}
