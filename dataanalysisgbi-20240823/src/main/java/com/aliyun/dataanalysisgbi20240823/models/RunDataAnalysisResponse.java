// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataanalysisgbi20240823.models;

import com.aliyun.tea.*;

public class RunDataAnalysisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunDataAnalysisResponseBody body;

    public static RunDataAnalysisResponse build(java.util.Map<String, ?> map) throws Exception {
        RunDataAnalysisResponse self = new RunDataAnalysisResponse();
        return TeaModel.build(map, self);
    }

    public RunDataAnalysisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunDataAnalysisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunDataAnalysisResponse setBody(RunDataAnalysisResponseBody body) {
        this.body = body;
        return this;
    }
    public RunDataAnalysisResponseBody getBody() {
        return this.body;
    }

}
