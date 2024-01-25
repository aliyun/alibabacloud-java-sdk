// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdp20210402.models;

import com.aliyun.tea.*;

public class ReleaseClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ReleaseClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReleaseClusterResponse setBody(ReleaseClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseClusterResponseBody getBody() {
        return this.body;
    }

}
