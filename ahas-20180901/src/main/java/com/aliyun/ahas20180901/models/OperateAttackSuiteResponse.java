// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class OperateAttackSuiteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public OperateAttackSuiteResponseBody body;

    public static OperateAttackSuiteResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateAttackSuiteResponse self = new OperateAttackSuiteResponse();
        return TeaModel.build(map, self);
    }

    public OperateAttackSuiteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateAttackSuiteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OperateAttackSuiteResponse setBody(OperateAttackSuiteResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateAttackSuiteResponseBody getBody() {
        return this.body;
    }

}
