// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class RefundOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RefundOrderResponseBody body;

    public static RefundOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        RefundOrderResponse self = new RefundOrderResponse();
        return TeaModel.build(map, self);
    }

    public RefundOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefundOrderResponse setBody(RefundOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public RefundOrderResponseBody getBody() {
        return this.body;
    }

}
