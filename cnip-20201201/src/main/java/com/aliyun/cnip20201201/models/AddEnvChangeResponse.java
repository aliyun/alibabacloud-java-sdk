// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class AddEnvChangeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddEnvChangeResponseBody body;

    public static AddEnvChangeResponse build(java.util.Map<String, ?> map) throws Exception {
        AddEnvChangeResponse self = new AddEnvChangeResponse();
        return TeaModel.build(map, self);
    }

    public AddEnvChangeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddEnvChangeResponse setBody(AddEnvChangeResponseBody body) {
        this.body = body;
        return this;
    }
    public AddEnvChangeResponseBody getBody() {
        return this.body;
    }

}
