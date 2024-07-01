// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ReleaseClusterPublicConnectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ReleaseClusterPublicConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReleaseClusterPublicConnectionResponse setBody(ReleaseClusterPublicConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseClusterPublicConnectionResponseBody getBody() {
        return this.body;
    }

}
