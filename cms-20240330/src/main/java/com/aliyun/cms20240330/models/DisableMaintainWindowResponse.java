// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DisableMaintainWindowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableMaintainWindowResponseBody body;

    public static DisableMaintainWindowResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableMaintainWindowResponse self = new DisableMaintainWindowResponse();
        return TeaModel.build(map, self);
    }

    public DisableMaintainWindowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableMaintainWindowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableMaintainWindowResponse setBody(DisableMaintainWindowResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableMaintainWindowResponseBody getBody() {
        return this.body;
    }

}
