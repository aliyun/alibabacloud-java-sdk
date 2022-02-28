// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class UnregisterDiskGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UnregisterDiskGroupResponseBody body;

    public static UnregisterDiskGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UnregisterDiskGroupResponse self = new UnregisterDiskGroupResponse();
        return TeaModel.build(map, self);
    }

    public UnregisterDiskGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnregisterDiskGroupResponse setBody(UnregisterDiskGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UnregisterDiskGroupResponseBody getBody() {
        return this.body;
    }

}
