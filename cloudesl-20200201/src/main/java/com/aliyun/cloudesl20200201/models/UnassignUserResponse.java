// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class UnassignUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UnassignUserResponseBody body;

    public static UnassignUserResponse build(java.util.Map<String, ?> map) throws Exception {
        UnassignUserResponse self = new UnassignUserResponse();
        return TeaModel.build(map, self);
    }

    public UnassignUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnassignUserResponse setBody(UnassignUserResponseBody body) {
        this.body = body;
        return this;
    }
    public UnassignUserResponseBody getBody() {
        return this.body;
    }

}
