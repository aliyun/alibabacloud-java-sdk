// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class AttachInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AttachInstancesResponseBody body;

    public static AttachInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachInstancesResponse self = new AttachInstancesResponse();
        return TeaModel.build(map, self);
    }

    public AttachInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachInstancesResponse setBody(AttachInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachInstancesResponseBody getBody() {
        return this.body;
    }

}
