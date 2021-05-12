// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class AddEnvironmentProductVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddEnvironmentProductVersionResponseBody body;

    public static AddEnvironmentProductVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        AddEnvironmentProductVersionResponse self = new AddEnvironmentProductVersionResponse();
        return TeaModel.build(map, self);
    }

    public AddEnvironmentProductVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddEnvironmentProductVersionResponse setBody(AddEnvironmentProductVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public AddEnvironmentProductVersionResponseBody getBody() {
        return this.body;
    }

}
