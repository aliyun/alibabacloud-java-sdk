// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class TransformClusterMemberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TransformClusterMemberResponseBody body;

    public static TransformClusterMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        TransformClusterMemberResponse self = new TransformClusterMemberResponse();
        return TeaModel.build(map, self);
    }

    public TransformClusterMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TransformClusterMemberResponse setBody(TransformClusterMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public TransformClusterMemberResponseBody getBody() {
        return this.body;
    }

}
