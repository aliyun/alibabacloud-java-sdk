// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class AllocatePublicContactPointsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AllocatePublicContactPointsResponseBody body;

    public static AllocatePublicContactPointsResponse build(java.util.Map<String, ?> map) throws Exception {
        AllocatePublicContactPointsResponse self = new AllocatePublicContactPointsResponse();
        return TeaModel.build(map, self);
    }

    public AllocatePublicContactPointsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AllocatePublicContactPointsResponse setBody(AllocatePublicContactPointsResponseBody body) {
        this.body = body;
        return this;
    }
    public AllocatePublicContactPointsResponseBody getBody() {
        return this.body;
    }

}
