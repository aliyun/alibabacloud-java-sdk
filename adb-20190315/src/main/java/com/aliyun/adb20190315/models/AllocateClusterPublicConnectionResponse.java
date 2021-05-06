// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class AllocateClusterPublicConnectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public AllocateClusterPublicConnectionResponse setBody(AllocateClusterPublicConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public AllocateClusterPublicConnectionResponseBody getBody() {
        return this.body;
    }

}
