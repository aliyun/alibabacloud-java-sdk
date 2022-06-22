// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ClusterOnResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ClusterOnResponseBody body;

    public static ClusterOnResponse build(java.util.Map<String, ?> map) throws Exception {
        ClusterOnResponse self = new ClusterOnResponse();
        return TeaModel.build(map, self);
    }

    public ClusterOnResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClusterOnResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ClusterOnResponse setBody(ClusterOnResponseBody body) {
        this.body = body;
        return this;
    }
    public ClusterOnResponseBody getBody() {
        return this.body;
    }

}
