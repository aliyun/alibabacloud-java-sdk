// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ReleaseDedicatedHostResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReleaseDedicatedHostResponseBody body;

    public static ReleaseDedicatedHostResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseDedicatedHostResponse self = new ReleaseDedicatedHostResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseDedicatedHostResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseDedicatedHostResponse setBody(ReleaseDedicatedHostResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseDedicatedHostResponseBody getBody() {
        return this.body;
    }

}
