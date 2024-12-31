// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bss20140714.models;

import com.aliyun.tea.*;

public class VnoBatchRefundOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VnoBatchRefundOrderResponseBody body;

    public static VnoBatchRefundOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        VnoBatchRefundOrderResponse self = new VnoBatchRefundOrderResponse();
        return TeaModel.build(map, self);
    }

    public VnoBatchRefundOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VnoBatchRefundOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VnoBatchRefundOrderResponse setBody(VnoBatchRefundOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public VnoBatchRefundOrderResponseBody getBody() {
        return this.body;
    }

}
