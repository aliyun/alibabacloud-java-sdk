// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SubmitSmartClipTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitSmartClipTaskResponseBody body;

    public static SubmitSmartClipTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitSmartClipTaskResponse self = new SubmitSmartClipTaskResponse();
        return TeaModel.build(map, self);
    }

    public SubmitSmartClipTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitSmartClipTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitSmartClipTaskResponse setBody(SubmitSmartClipTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitSmartClipTaskResponseBody getBody() {
        return this.body;
    }

}
