// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20200618.models;

import com.aliyun.tea.*;

public class VerifyBankElementResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public VerifyBankElementResponseBody body;

    public static VerifyBankElementResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyBankElementResponse self = new VerifyBankElementResponse();
        return TeaModel.build(map, self);
    }

    public VerifyBankElementResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyBankElementResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VerifyBankElementResponse setBody(VerifyBankElementResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyBankElementResponseBody getBody() {
        return this.body;
    }

}
