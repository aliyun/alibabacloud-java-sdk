// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CloseOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CloseOrderResponseBody body;

    public static CloseOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CloseOrderResponse self = new CloseOrderResponse();
        return TeaModel.build(map, self);
    }

    public CloseOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloseOrderResponse setBody(CloseOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CloseOrderResponseBody getBody() {
        return this.body;
    }

}
