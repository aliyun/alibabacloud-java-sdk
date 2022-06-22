// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class UpdateAttackSuiteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAttackSuiteResponseBody body;

    public static UpdateAttackSuiteResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAttackSuiteResponse self = new UpdateAttackSuiteResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAttackSuiteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAttackSuiteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAttackSuiteResponse setBody(UpdateAttackSuiteResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAttackSuiteResponseBody getBody() {
        return this.body;
    }

}
