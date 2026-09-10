// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class EnableMaintainWindowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableMaintainWindowResponseBody body;

    public static EnableMaintainWindowResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableMaintainWindowResponse self = new EnableMaintainWindowResponse();
        return TeaModel.build(map, self);
    }

    public EnableMaintainWindowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableMaintainWindowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableMaintainWindowResponse setBody(EnableMaintainWindowResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableMaintainWindowResponseBody getBody() {
        return this.body;
    }

}
