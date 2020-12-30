// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DetachAndReleaseClusterEniResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DetachAndReleaseClusterEniResponseBody body;

    public static DetachAndReleaseClusterEniResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachAndReleaseClusterEniResponse self = new DetachAndReleaseClusterEniResponse();
        return TeaModel.build(map, self);
    }

    public DetachAndReleaseClusterEniResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachAndReleaseClusterEniResponse setBody(DetachAndReleaseClusterEniResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachAndReleaseClusterEniResponseBody getBody() {
        return this.body;
    }

}
