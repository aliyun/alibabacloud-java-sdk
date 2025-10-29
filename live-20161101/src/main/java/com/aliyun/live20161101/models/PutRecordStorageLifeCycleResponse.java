// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class PutRecordStorageLifeCycleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PutRecordStorageLifeCycleResponseBody body;

    public static PutRecordStorageLifeCycleResponse build(java.util.Map<String, ?> map) throws Exception {
        PutRecordStorageLifeCycleResponse self = new PutRecordStorageLifeCycleResponse();
        return TeaModel.build(map, self);
    }

    public PutRecordStorageLifeCycleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutRecordStorageLifeCycleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutRecordStorageLifeCycleResponse setBody(PutRecordStorageLifeCycleResponseBody body) {
        this.body = body;
        return this;
    }
    public PutRecordStorageLifeCycleResponseBody getBody() {
        return this.body;
    }

}
