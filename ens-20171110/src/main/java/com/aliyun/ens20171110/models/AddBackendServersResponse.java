// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AddBackendServersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public AddBackendServersResponse setBody(AddBackendServersResponseBody body) {
        this.body = body;
        return this;
    }
    public AddBackendServersResponseBody getBody() {
        return this.body;
    }

}
