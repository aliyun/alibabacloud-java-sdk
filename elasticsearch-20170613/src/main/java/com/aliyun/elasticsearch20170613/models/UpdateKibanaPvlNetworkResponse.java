// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateKibanaPvlNetworkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateKibanaPvlNetworkResponseBody body;

    public static UpdateKibanaPvlNetworkResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateKibanaPvlNetworkResponse self = new UpdateKibanaPvlNetworkResponse();
        return TeaModel.build(map, self);
    }

    public UpdateKibanaPvlNetworkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateKibanaPvlNetworkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateKibanaPvlNetworkResponse setBody(UpdateKibanaPvlNetworkResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateKibanaPvlNetworkResponseBody getBody() {
        return this.body;
    }

}
