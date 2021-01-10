// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UnbindInputBucketResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UnbindInputBucketResponseBody body;

    public static UnbindInputBucketResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindInputBucketResponse self = new UnbindInputBucketResponse();
        return TeaModel.build(map, self);
    }

    public UnbindInputBucketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindInputBucketResponse setBody(UnbindInputBucketResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindInputBucketResponseBody getBody() {
        return this.body;
    }

}
