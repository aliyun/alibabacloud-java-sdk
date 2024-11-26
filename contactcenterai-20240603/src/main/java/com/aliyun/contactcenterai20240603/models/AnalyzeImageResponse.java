// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.contactcenterai20240603.models;

import com.aliyun.tea.*;

public class AnalyzeImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AnalyzeImageResponseBody body;

    public static AnalyzeImageResponse build(java.util.Map<String, ?> map) throws Exception {
        AnalyzeImageResponse self = new AnalyzeImageResponse();
        return TeaModel.build(map, self);
    }

    public AnalyzeImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AnalyzeImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AnalyzeImageResponse setBody(AnalyzeImageResponseBody body) {
        this.body = body;
        return this;
    }
    public AnalyzeImageResponseBody getBody() {
        return this.body;
    }

}
