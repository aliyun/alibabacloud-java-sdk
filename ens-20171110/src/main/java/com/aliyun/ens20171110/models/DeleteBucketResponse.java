// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteBucketResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteBucketResponseBody body;

    public static DeleteBucketResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBucketResponse self = new DeleteBucketResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBucketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBucketResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteBucketResponse setBody(DeleteBucketResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBucketResponseBody getBody() {
        return this.body;
    }

}
