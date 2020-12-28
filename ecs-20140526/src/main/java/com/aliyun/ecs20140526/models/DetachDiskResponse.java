// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DetachDiskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DetachDiskResponseBody body;

    public static DetachDiskResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachDiskResponse self = new DetachDiskResponse();
        return TeaModel.build(map, self);
    }

    public DetachDiskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachDiskResponse setBody(DetachDiskResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachDiskResponseBody getBody() {
        return this.body;
    }

}
