// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class BindInputBucketResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BindInputBucketResponseBody body;

    public static BindInputBucketResponse build(java.util.Map<String, ?> map) throws Exception {
        BindInputBucketResponse self = new BindInputBucketResponse();
        return TeaModel.build(map, self);
    }

    public BindInputBucketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindInputBucketResponse setBody(BindInputBucketResponseBody body) {
        this.body = body;
        return this;
    }
    public BindInputBucketResponseBody getBody() {
        return this.body;
    }

}
