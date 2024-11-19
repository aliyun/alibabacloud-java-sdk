// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimath20241114.models;

import com.aliyun.tea.*;

public class GenAnalysisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenAnalysisResponseBody body;

    public static GenAnalysisResponse build(java.util.Map<String, ?> map) throws Exception {
        GenAnalysisResponse self = new GenAnalysisResponse();
        return TeaModel.build(map, self);
    }

    public GenAnalysisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenAnalysisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenAnalysisResponse setBody(GenAnalysisResponseBody body) {
        this.body = body;
        return this;
    }
    public GenAnalysisResponseBody getBody() {
        return this.body;
    }

}
