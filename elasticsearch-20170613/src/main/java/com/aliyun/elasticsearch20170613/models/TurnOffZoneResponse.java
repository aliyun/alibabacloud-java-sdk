// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class TurnOffZoneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TurnOffZoneResponseBody body;

    public static TurnOffZoneResponse build(java.util.Map<String, ?> map) throws Exception {
        TurnOffZoneResponse self = new TurnOffZoneResponse();
        return TeaModel.build(map, self);
    }

    public TurnOffZoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TurnOffZoneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TurnOffZoneResponse setBody(TurnOffZoneResponseBody body) {
        this.body = body;
        return this;
    }
    public TurnOffZoneResponseBody getBody() {
        return this.body;
    }

}
