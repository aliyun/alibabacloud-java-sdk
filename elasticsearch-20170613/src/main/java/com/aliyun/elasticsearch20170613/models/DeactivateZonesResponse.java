// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DeactivateZonesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeactivateZonesResponseBody body;

    public static DeactivateZonesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeactivateZonesResponse self = new DeactivateZonesResponse();
        return TeaModel.build(map, self);
    }

    public DeactivateZonesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeactivateZonesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeactivateZonesResponse setBody(DeactivateZonesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeactivateZonesResponseBody getBody() {
        return this.body;
    }

}
