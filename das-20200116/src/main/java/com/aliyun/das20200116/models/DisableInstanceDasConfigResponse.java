// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DisableInstanceDasConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableInstanceDasConfigResponseBody body;

    public static DisableInstanceDasConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableInstanceDasConfigResponse self = new DisableInstanceDasConfigResponse();
        return TeaModel.build(map, self);
    }

    public DisableInstanceDasConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableInstanceDasConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableInstanceDasConfigResponse setBody(DisableInstanceDasConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableInstanceDasConfigResponseBody getBody() {
        return this.body;
    }

}
