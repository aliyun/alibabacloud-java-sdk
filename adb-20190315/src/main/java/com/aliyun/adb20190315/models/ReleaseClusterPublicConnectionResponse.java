// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class ReleaseClusterPublicConnectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReleaseClusterPublicConnectionResponseBody body;

    public static ReleaseClusterPublicConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseClusterPublicConnectionResponse self = new ReleaseClusterPublicConnectionResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseClusterPublicConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseClusterPublicConnectionResponse setBody(ReleaseClusterPublicConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseClusterPublicConnectionResponseBody getBody() {
        return this.body;
    }

}
