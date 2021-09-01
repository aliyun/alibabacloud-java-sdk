// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class EnableOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableOrderResponseBody body;

    public static EnableOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableOrderResponse self = new EnableOrderResponse();
        return TeaModel.build(map, self);
    }

    public EnableOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableOrderResponse setBody(EnableOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableOrderResponseBody getBody() {
        return this.body;
    }

}
