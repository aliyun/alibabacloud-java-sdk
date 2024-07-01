// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkLogAnalyzeTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSparkLogAnalyzeTaskResponseBody body;

    public static GetSparkLogAnalyzeTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSparkLogAnalyzeTaskResponse self = new GetSparkLogAnalyzeTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetSparkLogAnalyzeTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSparkLogAnalyzeTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSparkLogAnalyzeTaskResponse setBody(GetSparkLogAnalyzeTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSparkLogAnalyzeTaskResponseBody getBody() {
        return this.body;
    }

}
