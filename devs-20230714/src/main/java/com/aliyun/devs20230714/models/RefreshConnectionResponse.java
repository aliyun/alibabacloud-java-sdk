// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class RefreshConnectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Connection body;

    public static RefreshConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshConnectionResponse self = new RefreshConnectionResponse();
        return TeaModel.build(map, self);
    }

    public RefreshConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefreshConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RefreshConnectionResponse setBody(Connection body) {
        this.body = body;
        return this;
    }
    public Connection getBody() {
        return this.body;
    }

}
