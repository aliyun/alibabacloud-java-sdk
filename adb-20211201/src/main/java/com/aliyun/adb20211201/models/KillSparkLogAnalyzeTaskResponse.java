// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class KillSparkLogAnalyzeTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public KillSparkLogAnalyzeTaskResponseBody body;

    public static KillSparkLogAnalyzeTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        KillSparkLogAnalyzeTaskResponse self = new KillSparkLogAnalyzeTaskResponse();
        return TeaModel.build(map, self);
    }

    public KillSparkLogAnalyzeTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public KillSparkLogAnalyzeTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public KillSparkLogAnalyzeTaskResponse setBody(KillSparkLogAnalyzeTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public KillSparkLogAnalyzeTaskResponseBody getBody() {
        return this.body;
    }

}
