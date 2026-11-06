// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class CtripOrderPushResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CtripOrderPushResponseBody body;

    public static CtripOrderPushResponse build(java.util.Map<String, ?> map) throws Exception {
        CtripOrderPushResponse self = new CtripOrderPushResponse();
        return TeaModel.build(map, self);
    }

    public CtripOrderPushResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CtripOrderPushResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CtripOrderPushResponse setBody(CtripOrderPushResponseBody body) {
        this.body = body;
        return this;
    }
    public CtripOrderPushResponseBody getBody() {
        return this.body;
    }

}
