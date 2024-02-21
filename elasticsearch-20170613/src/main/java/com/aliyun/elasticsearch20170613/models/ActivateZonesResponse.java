// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ActivateZonesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ActivateZonesResponseBody body;

    public static ActivateZonesResponse build(java.util.Map<String, ?> map) throws Exception {
        ActivateZonesResponse self = new ActivateZonesResponse();
        return TeaModel.build(map, self);
    }

    public ActivateZonesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ActivateZonesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ActivateZonesResponse setBody(ActivateZonesResponseBody body) {
        this.body = body;
        return this;
    }
    public ActivateZonesResponseBody getBody() {
        return this.body;
    }

}
