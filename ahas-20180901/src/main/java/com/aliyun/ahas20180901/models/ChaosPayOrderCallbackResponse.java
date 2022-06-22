// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ChaosPayOrderCallbackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ChaosPayOrderCallbackResponseBody body;

    public static ChaosPayOrderCallbackResponse build(java.util.Map<String, ?> map) throws Exception {
        ChaosPayOrderCallbackResponse self = new ChaosPayOrderCallbackResponse();
        return TeaModel.build(map, self);
    }

    public ChaosPayOrderCallbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChaosPayOrderCallbackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChaosPayOrderCallbackResponse setBody(ChaosPayOrderCallbackResponseBody body) {
        this.body = body;
        return this;
    }
    public ChaosPayOrderCallbackResponseBody getBody() {
        return this.body;
    }

}
