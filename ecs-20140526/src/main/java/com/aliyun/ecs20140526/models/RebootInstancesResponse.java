// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RebootInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RebootInstancesResponseBody body;

    public static RebootInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        RebootInstancesResponse self = new RebootInstancesResponse();
        return TeaModel.build(map, self);
    }

    public RebootInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RebootInstancesResponse setBody(RebootInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public RebootInstancesResponseBody getBody() {
        return this.body;
    }

}
