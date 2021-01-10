// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class BindOutputBucketResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BindOutputBucketResponseBody body;

    public static BindOutputBucketResponse build(java.util.Map<String, ?> map) throws Exception {
        BindOutputBucketResponse self = new BindOutputBucketResponse();
        return TeaModel.build(map, self);
    }

    public BindOutputBucketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindOutputBucketResponse setBody(BindOutputBucketResponseBody body) {
        this.body = body;
        return this;
    }
    public BindOutputBucketResponseBody getBody() {
        return this.body;
    }

}
