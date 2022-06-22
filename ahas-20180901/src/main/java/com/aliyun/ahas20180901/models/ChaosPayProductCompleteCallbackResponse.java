// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ChaosPayProductCompleteCallbackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ChaosPayProductCompleteCallbackResponseBody body;

    public static ChaosPayProductCompleteCallbackResponse build(java.util.Map<String, ?> map) throws Exception {
        ChaosPayProductCompleteCallbackResponse self = new ChaosPayProductCompleteCallbackResponse();
        return TeaModel.build(map, self);
    }

    public ChaosPayProductCompleteCallbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChaosPayProductCompleteCallbackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChaosPayProductCompleteCallbackResponse setBody(ChaosPayProductCompleteCallbackResponseBody body) {
        this.body = body;
        return this;
    }
    public ChaosPayProductCompleteCallbackResponseBody getBody() {
        return this.body;
    }

}
