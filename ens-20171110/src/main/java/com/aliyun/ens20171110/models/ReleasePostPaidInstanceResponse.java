// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ReleasePostPaidInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReleasePostPaidInstanceResponseBody body;

    public static ReleasePostPaidInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleasePostPaidInstanceResponse self = new ReleasePostPaidInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ReleasePostPaidInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleasePostPaidInstanceResponse setBody(ReleasePostPaidInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleasePostPaidInstanceResponseBody getBody() {
        return this.body;
    }

}
