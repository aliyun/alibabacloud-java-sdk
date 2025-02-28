// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class SetBucketTransferAccelerationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetBucketTransferAccelerationResponseBody body;

    public static SetBucketTransferAccelerationResponse build(java.util.Map<String, ?> map) throws Exception {
        SetBucketTransferAccelerationResponse self = new SetBucketTransferAccelerationResponse();
        return TeaModel.build(map, self);
    }

    public SetBucketTransferAccelerationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetBucketTransferAccelerationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetBucketTransferAccelerationResponse setBody(SetBucketTransferAccelerationResponseBody body) {
        this.body = body;
        return this;
    }
    public SetBucketTransferAccelerationResponseBody getBody() {
        return this.body;
    }

}
