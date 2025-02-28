// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class DeleteBucketReplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteBucketReplicationResponseBody body;

    public static DeleteBucketReplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBucketReplicationResponse self = new DeleteBucketReplicationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBucketReplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBucketReplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteBucketReplicationResponse setBody(DeleteBucketReplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBucketReplicationResponseBody getBody() {
        return this.body;
    }

}
