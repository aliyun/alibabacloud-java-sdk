// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class BicyclingDirectionNovaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BicyclingDirectionNovaResponseBody body;

    public static BicyclingDirectionNovaResponse build(java.util.Map<String, ?> map) throws Exception {
        BicyclingDirectionNovaResponse self = new BicyclingDirectionNovaResponse();
        return TeaModel.build(map, self);
    }

    public BicyclingDirectionNovaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BicyclingDirectionNovaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BicyclingDirectionNovaResponse setBody(BicyclingDirectionNovaResponseBody body) {
        this.body = body;
        return this;
    }
    public BicyclingDirectionNovaResponseBody getBody() {
        return this.body;
    }

}
