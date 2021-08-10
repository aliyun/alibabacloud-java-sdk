// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class OperateFeeOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OperateFeeOrderResponseBody body;

    public static OperateFeeOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateFeeOrderResponse self = new OperateFeeOrderResponse();
        return TeaModel.build(map, self);
    }

    public OperateFeeOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateFeeOrderResponse setBody(OperateFeeOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateFeeOrderResponseBody getBody() {
        return this.body;
    }

}
