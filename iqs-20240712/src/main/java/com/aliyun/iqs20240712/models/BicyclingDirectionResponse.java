// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class BicyclingDirectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BicyclingDirectionResponseBody body;

    public static BicyclingDirectionResponse build(java.util.Map<String, ?> map) throws Exception {
        BicyclingDirectionResponse self = new BicyclingDirectionResponse();
        return TeaModel.build(map, self);
    }

    public BicyclingDirectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BicyclingDirectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BicyclingDirectionResponse setBody(BicyclingDirectionResponseBody body) {
        this.body = body;
        return this;
    }
    public BicyclingDirectionResponseBody getBody() {
        return this.body;
    }

}
