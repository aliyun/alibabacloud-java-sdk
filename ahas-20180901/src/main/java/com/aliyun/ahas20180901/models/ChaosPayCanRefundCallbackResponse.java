// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ChaosPayCanRefundCallbackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ChaosPayCanRefundCallbackResponseBody body;

    public static ChaosPayCanRefundCallbackResponse build(java.util.Map<String, ?> map) throws Exception {
        ChaosPayCanRefundCallbackResponse self = new ChaosPayCanRefundCallbackResponse();
        return TeaModel.build(map, self);
    }

    public ChaosPayCanRefundCallbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChaosPayCanRefundCallbackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChaosPayCanRefundCallbackResponse setBody(ChaosPayCanRefundCallbackResponseBody body) {
        this.body = body;
        return this;
    }
    public ChaosPayCanRefundCallbackResponseBody getBody() {
        return this.body;
    }

}
