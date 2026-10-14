// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class PauseC2paBucketSignTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PauseC2paBucketSignTaskResponseBody body;

    public static PauseC2paBucketSignTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        PauseC2paBucketSignTaskResponse self = new PauseC2paBucketSignTaskResponse();
        return TeaModel.build(map, self);
    }

    public PauseC2paBucketSignTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PauseC2paBucketSignTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PauseC2paBucketSignTaskResponse setBody(PauseC2paBucketSignTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public PauseC2paBucketSignTaskResponseBody getBody() {
        return this.body;
    }

}
