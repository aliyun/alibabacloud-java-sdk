// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteBucketLifecycleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteBucketLifecycleResponseBody body;

    public static DeleteBucketLifecycleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBucketLifecycleResponse self = new DeleteBucketLifecycleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBucketLifecycleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBucketLifecycleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteBucketLifecycleResponse setBody(DeleteBucketLifecycleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBucketLifecycleResponseBody getBody() {
        return this.body;
    }

}
