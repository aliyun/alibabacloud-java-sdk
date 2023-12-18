// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class PutBucketResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PutBucketResponseBody body;

    public static PutBucketResponse build(java.util.Map<String, ?> map) throws Exception {
        PutBucketResponse self = new PutBucketResponse();
        return TeaModel.build(map, self);
    }

    public PutBucketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutBucketResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutBucketResponse setBody(PutBucketResponseBody body) {
        this.body = body;
        return this;
    }
    public PutBucketResponseBody getBody() {
        return this.body;
    }

}
