// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20180703.models;

import com.aliyun.tea.*;

public class SetCreditLimitResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SetCreditLimitResponseBody body;

    public static SetCreditLimitResponse build(java.util.Map<String, ?> map) throws Exception {
        SetCreditLimitResponse self = new SetCreditLimitResponse();
        return TeaModel.build(map, self);
    }

    public SetCreditLimitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetCreditLimitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetCreditLimitResponse setBody(SetCreditLimitResponseBody body) {
        this.body = body;
        return this;
    }
    public SetCreditLimitResponseBody getBody() {
        return this.body;
    }

}
