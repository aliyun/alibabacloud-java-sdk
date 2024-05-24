// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ActivateConnectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Connection body;

    public static ActivateConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        ActivateConnectionResponse self = new ActivateConnectionResponse();
        return TeaModel.build(map, self);
    }

    public ActivateConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ActivateConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ActivateConnectionResponse setBody(Connection body) {
        this.body = body;
        return this;
    }
    public Connection getBody() {
        return this.body;
    }

}
