// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class AllocateClusterVpcConnectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AllocateClusterVpcConnectionResponseBody body;

    public static AllocateClusterVpcConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        AllocateClusterVpcConnectionResponse self = new AllocateClusterVpcConnectionResponse();
        return TeaModel.build(map, self);
    }

    public AllocateClusterVpcConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AllocateClusterVpcConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AllocateClusterVpcConnectionResponse setBody(AllocateClusterVpcConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public AllocateClusterVpcConnectionResponseBody getBody() {
        return this.body;
    }

}
