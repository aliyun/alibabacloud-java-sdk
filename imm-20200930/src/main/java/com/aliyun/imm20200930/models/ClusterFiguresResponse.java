// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ClusterFiguresResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ClusterFiguresResponseBody body;

    public static ClusterFiguresResponse build(java.util.Map<String, ?> map) throws Exception {
        ClusterFiguresResponse self = new ClusterFiguresResponse();
        return TeaModel.build(map, self);
    }

    public ClusterFiguresResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClusterFiguresResponse setBody(ClusterFiguresResponseBody body) {
        this.body = body;
        return this;
    }
    public ClusterFiguresResponseBody getBody() {
        return this.body;
    }

}
