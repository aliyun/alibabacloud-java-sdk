// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdp20210402.models;

import com.aliyun.tea.*;

public class ReleaseClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReleaseClusterResponseBody body;

    public static ReleaseClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseClusterResponse self = new ReleaseClusterResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseClusterResponse setBody(ReleaseClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseClusterResponseBody getBody() {
        return this.body;
    }

}
