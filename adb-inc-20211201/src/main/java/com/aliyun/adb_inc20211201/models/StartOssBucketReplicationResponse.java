// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class StartOssBucketReplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartOssBucketReplicationResponseBody body;

    public static StartOssBucketReplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        StartOssBucketReplicationResponse self = new StartOssBucketReplicationResponse();
        return TeaModel.build(map, self);
    }

    public StartOssBucketReplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartOssBucketReplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartOssBucketReplicationResponse setBody(StartOssBucketReplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public StartOssBucketReplicationResponseBody getBody() {
        return this.body;
    }

}
