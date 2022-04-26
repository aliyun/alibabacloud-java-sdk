// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class AttachOSSBucketResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public AttachOSSBucketResponse setBody(AttachOSSBucketResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachOSSBucketResponseBody getBody() {
        return this.body;
    }

}
