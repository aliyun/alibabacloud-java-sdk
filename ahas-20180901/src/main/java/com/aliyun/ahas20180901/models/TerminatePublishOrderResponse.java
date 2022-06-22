// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class TerminatePublishOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public TerminatePublishOrderResponseBody body;

    public static TerminatePublishOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        TerminatePublishOrderResponse self = new TerminatePublishOrderResponse();
        return TeaModel.build(map, self);
    }

    public TerminatePublishOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TerminatePublishOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TerminatePublishOrderResponse setBody(TerminatePublishOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public TerminatePublishOrderResponseBody getBody() {
        return this.body;
    }

}
