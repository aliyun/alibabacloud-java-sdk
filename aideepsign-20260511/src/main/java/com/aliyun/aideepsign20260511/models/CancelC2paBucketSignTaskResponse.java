// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class CancelC2paBucketSignTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelC2paBucketSignTaskResponseBody body;

    public static CancelC2paBucketSignTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelC2paBucketSignTaskResponse self = new CancelC2paBucketSignTaskResponse();
        return TeaModel.build(map, self);
    }

    public CancelC2paBucketSignTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelC2paBucketSignTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelC2paBucketSignTaskResponse setBody(CancelC2paBucketSignTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelC2paBucketSignTaskResponseBody getBody() {
        return this.body;
    }

}
