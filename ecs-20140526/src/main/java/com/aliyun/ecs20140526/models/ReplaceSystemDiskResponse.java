// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ReplaceSystemDiskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReplaceSystemDiskResponseBody body;

    public static ReplaceSystemDiskResponse build(java.util.Map<String, ?> map) throws Exception {
        ReplaceSystemDiskResponse self = new ReplaceSystemDiskResponse();
        return TeaModel.build(map, self);
    }

    public ReplaceSystemDiskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReplaceSystemDiskResponse setBody(ReplaceSystemDiskResponseBody body) {
        this.body = body;
        return this;
    }
    public ReplaceSystemDiskResponseBody getBody() {
        return this.body;
    }

}
