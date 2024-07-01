// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class SubmitSparkLogAnalyzeTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitSparkLogAnalyzeTaskResponseBody body;

    public static SubmitSparkLogAnalyzeTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitSparkLogAnalyzeTaskResponse self = new SubmitSparkLogAnalyzeTaskResponse();
        return TeaModel.build(map, self);
    }

    public SubmitSparkLogAnalyzeTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitSparkLogAnalyzeTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitSparkLogAnalyzeTaskResponse setBody(SubmitSparkLogAnalyzeTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitSparkLogAnalyzeTaskResponseBody getBody() {
        return this.body;
    }

}
