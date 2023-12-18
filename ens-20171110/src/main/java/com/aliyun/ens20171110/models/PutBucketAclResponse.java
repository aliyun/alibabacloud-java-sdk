// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class PutBucketAclResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PutBucketAclResponseBody body;

    public static PutBucketAclResponse build(java.util.Map<String, ?> map) throws Exception {
        PutBucketAclResponse self = new PutBucketAclResponse();
        return TeaModel.build(map, self);
    }

    public PutBucketAclResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutBucketAclResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutBucketAclResponse setBody(PutBucketAclResponseBody body) {
        this.body = body;
        return this;
    }
    public PutBucketAclResponseBody getBody() {
        return this.body;
    }

}
