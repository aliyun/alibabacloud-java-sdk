// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class ConvertPostPayOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ConvertPostPayOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConvertPostPayOrderResponse setBody(ConvertPostPayOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public ConvertPostPayOrderResponseBody getBody() {
        return this.body;
    }

}
