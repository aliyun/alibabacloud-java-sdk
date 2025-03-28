// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class PreCheckCreateGadOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PreCheckCreateGadOrderResponseBody body;

    public static PreCheckCreateGadOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        PreCheckCreateGadOrderResponse self = new PreCheckCreateGadOrderResponse();
        return TeaModel.build(map, self);
    }

    public PreCheckCreateGadOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PreCheckCreateGadOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PreCheckCreateGadOrderResponse setBody(PreCheckCreateGadOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public PreCheckCreateGadOrderResponseBody getBody() {
        return this.body;
    }

}
