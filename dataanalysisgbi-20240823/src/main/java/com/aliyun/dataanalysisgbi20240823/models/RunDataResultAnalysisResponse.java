// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataanalysisgbi20240823.models;

import com.aliyun.tea.*;

public class RunDataResultAnalysisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunDataResultAnalysisResponseBody body;

    public static RunDataResultAnalysisResponse build(java.util.Map<String, ?> map) throws Exception {
        RunDataResultAnalysisResponse self = new RunDataResultAnalysisResponse();
        return TeaModel.build(map, self);
    }

    public RunDataResultAnalysisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunDataResultAnalysisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunDataResultAnalysisResponse setBody(RunDataResultAnalysisResponseBody body) {
        this.body = body;
        return this;
    }
    public RunDataResultAnalysisResponseBody getBody() {
        return this.body;
    }

}
