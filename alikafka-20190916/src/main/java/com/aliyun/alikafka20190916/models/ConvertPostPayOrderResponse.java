// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class ConvertPostPayOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ConvertPostPayOrderResponseBody body;

    public static ConvertPostPayOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        ConvertPostPayOrderResponse self = new ConvertPostPayOrderResponse();
        return TeaModel.build(map, self);
    }

    public ConvertPostPayOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConvertPostPayOrderResponse setBody(ConvertPostPayOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public ConvertPostPayOrderResponseBody getBody() {
        return this.body;
    }

}
