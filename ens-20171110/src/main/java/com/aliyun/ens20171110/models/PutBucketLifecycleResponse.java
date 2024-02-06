// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class PutBucketLifecycleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PutBucketLifecycleResponseBody body;

    public static PutBucketLifecycleResponse build(java.util.Map<String, ?> map) throws Exception {
        PutBucketLifecycleResponse self = new PutBucketLifecycleResponse();
        return TeaModel.build(map, self);
    }

    public PutBucketLifecycleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutBucketLifecycleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutBucketLifecycleResponse setBody(PutBucketLifecycleResponseBody body) {
        this.body = body;
        return this;
    }
    public PutBucketLifecycleResponseBody getBody() {
        return this.body;
    }

}
