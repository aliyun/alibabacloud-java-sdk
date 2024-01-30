// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class CheckRecoveryConditionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckRecoveryConditionResponseBody body;

    public static CheckRecoveryConditionResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckRecoveryConditionResponse self = new CheckRecoveryConditionResponse();
        return TeaModel.build(map, self);
    }

    public CheckRecoveryConditionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckRecoveryConditionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckRecoveryConditionResponse setBody(CheckRecoveryConditionResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckRecoveryConditionResponseBody getBody() {
        return this.body;
    }

}
