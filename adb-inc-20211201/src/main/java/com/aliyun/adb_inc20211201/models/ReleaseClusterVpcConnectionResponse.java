// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class ReleaseClusterVpcConnectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReleaseClusterVpcConnectionResponseBody body;

    public static ReleaseClusterVpcConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseClusterVpcConnectionResponse self = new ReleaseClusterVpcConnectionResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseClusterVpcConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseClusterVpcConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReleaseClusterVpcConnectionResponse setBody(ReleaseClusterVpcConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseClusterVpcConnectionResponseBody getBody() {
        return this.body;
    }

}
