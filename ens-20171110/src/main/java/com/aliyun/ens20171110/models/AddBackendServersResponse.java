// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AddBackendServersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddBackendServersResponseBody body;

    public static AddBackendServersResponse build(java.util.Map<String, ?> map) throws Exception {
        AddBackendServersResponse self = new AddBackendServersResponse();
        return TeaModel.build(map, self);
    }

    public AddBackendServersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddBackendServersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddBackendServersResponse setBody(AddBackendServersResponseBody body) {
        this.body = body;
        return this;
    }
    public AddBackendServersResponseBody getBody() {
        return this.body;
    }

}
