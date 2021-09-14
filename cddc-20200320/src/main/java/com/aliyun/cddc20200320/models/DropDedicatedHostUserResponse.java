// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class DropDedicatedHostUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DropDedicatedHostUserResponseBody body;

    public static DropDedicatedHostUserResponse build(java.util.Map<String, ?> map) throws Exception {
        DropDedicatedHostUserResponse self = new DropDedicatedHostUserResponse();
        return TeaModel.build(map, self);
    }

    public DropDedicatedHostUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DropDedicatedHostUserResponse setBody(DropDedicatedHostUserResponseBody body) {
        this.body = body;
        return this;
    }
    public DropDedicatedHostUserResponseBody getBody() {
        return this.body;
    }

}
