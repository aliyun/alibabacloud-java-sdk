// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.grace20220606.models;

import com.aliyun.tea.*;

public class AnalyzeFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AnalyzeFileResponseBody body;

    public static AnalyzeFileResponse build(java.util.Map<String, ?> map) throws Exception {
        AnalyzeFileResponse self = new AnalyzeFileResponse();
        return TeaModel.build(map, self);
    }

    public AnalyzeFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AnalyzeFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AnalyzeFileResponse setBody(AnalyzeFileResponseBody body) {
        this.body = body;
        return this;
    }
    public AnalyzeFileResponseBody getBody() {
        return this.body;
    }

}
