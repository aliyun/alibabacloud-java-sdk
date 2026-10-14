// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class ResumeC2paBucketSignTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResumeC2paBucketSignTaskResponseBody body;

    public static ResumeC2paBucketSignTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ResumeC2paBucketSignTaskResponse self = new ResumeC2paBucketSignTaskResponse();
        return TeaModel.build(map, self);
    }

    public ResumeC2paBucketSignTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResumeC2paBucketSignTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResumeC2paBucketSignTaskResponse setBody(ResumeC2paBucketSignTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ResumeC2paBucketSignTaskResponseBody getBody() {
        return this.body;
    }

}
