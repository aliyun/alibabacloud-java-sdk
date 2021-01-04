// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class ReleasePublicContactPointsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReleasePublicContactPointsResponseBody body;

    public static ReleasePublicContactPointsResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleasePublicContactPointsResponse self = new ReleasePublicContactPointsResponse();
        return TeaModel.build(map, self);
    }

    public ReleasePublicContactPointsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleasePublicContactPointsResponse setBody(ReleasePublicContactPointsResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleasePublicContactPointsResponseBody getBody() {
        return this.body;
    }

}
