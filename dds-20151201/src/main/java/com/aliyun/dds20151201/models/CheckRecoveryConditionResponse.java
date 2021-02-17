// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class CheckRecoveryConditionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CheckRecoveryConditionResponse setBody(CheckRecoveryConditionResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckRecoveryConditionResponseBody getBody() {
        return this.body;
    }

}
