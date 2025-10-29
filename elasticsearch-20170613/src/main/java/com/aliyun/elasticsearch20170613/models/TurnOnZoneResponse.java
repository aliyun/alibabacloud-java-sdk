// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class TurnOnZoneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TurnOnZoneResponseBody body;

    public static TurnOnZoneResponse build(java.util.Map<String, ?> map) throws Exception {
        TurnOnZoneResponse self = new TurnOnZoneResponse();
        return TeaModel.build(map, self);
    }

    public TurnOnZoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TurnOnZoneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TurnOnZoneResponse setBody(TurnOnZoneResponseBody body) {
        this.body = body;
        return this;
    }
    public TurnOnZoneResponseBody getBody() {
        return this.body;
    }

}
