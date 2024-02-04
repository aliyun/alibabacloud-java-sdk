// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class AttachOSSBucketResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AttachOSSBucketResponseBody body;

    public static AttachOSSBucketResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachOSSBucketResponse self = new AttachOSSBucketResponse();
        return TeaModel.build(map, self);
    }

    public AttachOSSBucketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachOSSBucketResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachOSSBucketResponse setBody(AttachOSSBucketResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachOSSBucketResponseBody getBody() {
        return this.body;
    }

}
