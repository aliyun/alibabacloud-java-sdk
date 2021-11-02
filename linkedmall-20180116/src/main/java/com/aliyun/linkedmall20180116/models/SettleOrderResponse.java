// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class SettleOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SettleOrderResponseBody body;

    public static SettleOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        SettleOrderResponse self = new SettleOrderResponse();
        return TeaModel.build(map, self);
    }

    public SettleOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SettleOrderResponse setBody(SettleOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public SettleOrderResponseBody getBody() {
        return this.body;
    }

}
