// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class SwitchSynchronizationEndpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SwitchSynchronizationEndpointResponseBody body;

    public static SwitchSynchronizationEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        SwitchSynchronizationEndpointResponse self = new SwitchSynchronizationEndpointResponse();
        return TeaModel.build(map, self);
    }

    public SwitchSynchronizationEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SwitchSynchronizationEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SwitchSynchronizationEndpointResponse setBody(SwitchSynchronizationEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public SwitchSynchronizationEndpointResponseBody getBody() {
        return this.body;
    }

}
