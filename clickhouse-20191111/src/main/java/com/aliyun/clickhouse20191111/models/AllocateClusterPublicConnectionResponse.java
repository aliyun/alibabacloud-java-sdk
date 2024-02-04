// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class AllocateClusterPublicConnectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AllocateClusterPublicConnectionResponseBody body;

    public static AllocateClusterPublicConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        AllocateClusterPublicConnectionResponse self = new AllocateClusterPublicConnectionResponse();
        return TeaModel.build(map, self);
    }

    public AllocateClusterPublicConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AllocateClusterPublicConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AllocateClusterPublicConnectionResponse setBody(AllocateClusterPublicConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public AllocateClusterPublicConnectionResponseBody getBody() {
        return this.body;
    }

}
