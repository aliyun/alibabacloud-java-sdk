// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210220.models;

import com.aliyun.tea.*;

public class ClientUserLogoutResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ClientUserLogoutResponseBody body;

    public static ClientUserLogoutResponse build(java.util.Map<String, ?> map) throws Exception {
        ClientUserLogoutResponse self = new ClientUserLogoutResponse();
        return TeaModel.build(map, self);
    }

    public ClientUserLogoutResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClientUserLogoutResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ClientUserLogoutResponse setBody(ClientUserLogoutResponseBody body) {
        this.body = body;
        return this;
    }
    public ClientUserLogoutResponseBody getBody() {
        return this.body;
    }

}
