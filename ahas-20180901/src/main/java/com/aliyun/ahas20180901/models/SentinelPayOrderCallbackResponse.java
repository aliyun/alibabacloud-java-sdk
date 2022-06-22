// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelPayOrderCallbackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelPayOrderCallbackResponseBody body;

    public static SentinelPayOrderCallbackResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelPayOrderCallbackResponse self = new SentinelPayOrderCallbackResponse();
        return TeaModel.build(map, self);
    }

    public SentinelPayOrderCallbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelPayOrderCallbackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelPayOrderCallbackResponse setBody(SentinelPayOrderCallbackResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelPayOrderCallbackResponseBody getBody() {
        return this.body;
    }

}
