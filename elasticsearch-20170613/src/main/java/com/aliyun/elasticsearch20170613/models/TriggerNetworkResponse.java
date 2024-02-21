// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class TriggerNetworkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TriggerNetworkResponseBody body;

    public static TriggerNetworkResponse build(java.util.Map<String, ?> map) throws Exception {
        TriggerNetworkResponse self = new TriggerNetworkResponse();
        return TeaModel.build(map, self);
    }

    public TriggerNetworkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TriggerNetworkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TriggerNetworkResponse setBody(TriggerNetworkResponseBody body) {
        this.body = body;
        return this;
    }
    public TriggerNetworkResponseBody getBody() {
        return this.body;
    }

}
