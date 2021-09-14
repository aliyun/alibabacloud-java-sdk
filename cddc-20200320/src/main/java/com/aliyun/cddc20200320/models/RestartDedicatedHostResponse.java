// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class RestartDedicatedHostResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RestartDedicatedHostResponseBody body;

    public static RestartDedicatedHostResponse build(java.util.Map<String, ?> map) throws Exception {
        RestartDedicatedHostResponse self = new RestartDedicatedHostResponse();
        return TeaModel.build(map, self);
    }

    public RestartDedicatedHostResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestartDedicatedHostResponse setBody(RestartDedicatedHostResponseBody body) {
        this.body = body;
        return this;
    }
    public RestartDedicatedHostResponseBody getBody() {
        return this.body;
    }

}
