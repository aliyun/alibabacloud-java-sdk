// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ChaosPayOrderVerifyCallbackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ChaosPayOrderVerifyCallbackResponseBody body;

    public static ChaosPayOrderVerifyCallbackResponse build(java.util.Map<String, ?> map) throws Exception {
        ChaosPayOrderVerifyCallbackResponse self = new ChaosPayOrderVerifyCallbackResponse();
        return TeaModel.build(map, self);
    }

    public ChaosPayOrderVerifyCallbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChaosPayOrderVerifyCallbackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChaosPayOrderVerifyCallbackResponse setBody(ChaosPayOrderVerifyCallbackResponseBody body) {
        this.body = body;
        return this;
    }
    public ChaosPayOrderVerifyCallbackResponseBody getBody() {
        return this.body;
    }

}
