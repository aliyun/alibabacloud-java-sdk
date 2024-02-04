// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DetachOSSBucketResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetachOSSBucketResponseBody body;

    public static DetachOSSBucketResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachOSSBucketResponse self = new DetachOSSBucketResponse();
        return TeaModel.build(map, self);
    }

    public DetachOSSBucketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachOSSBucketResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachOSSBucketResponse setBody(DetachOSSBucketResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachOSSBucketResponseBody getBody() {
        return this.body;
    }

}
