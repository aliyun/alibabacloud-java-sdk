// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class PurgeClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PurgeClusterResponseBody body;

    public static PurgeClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        PurgeClusterResponse self = new PurgeClusterResponse();
        return TeaModel.build(map, self);
    }

    public PurgeClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PurgeClusterResponse setBody(PurgeClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public PurgeClusterResponseBody getBody() {
        return this.body;
    }

}
