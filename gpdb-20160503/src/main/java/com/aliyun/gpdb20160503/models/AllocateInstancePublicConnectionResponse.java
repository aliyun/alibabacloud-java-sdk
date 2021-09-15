// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class AllocateInstancePublicConnectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AllocateInstancePublicConnectionResponseBody body;

    public static AllocateInstancePublicConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        AllocateInstancePublicConnectionResponse self = new AllocateInstancePublicConnectionResponse();
        return TeaModel.build(map, self);
    }

    public AllocateInstancePublicConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AllocateInstancePublicConnectionResponse setBody(AllocateInstancePublicConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public AllocateInstancePublicConnectionResponseBody getBody() {
        return this.body;
    }

}
