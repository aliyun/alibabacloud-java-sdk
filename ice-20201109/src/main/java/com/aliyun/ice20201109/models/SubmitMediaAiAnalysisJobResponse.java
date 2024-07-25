// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitMediaAiAnalysisJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitMediaAiAnalysisJobResponseBody body;

    public static SubmitMediaAiAnalysisJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitMediaAiAnalysisJobResponse self = new SubmitMediaAiAnalysisJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitMediaAiAnalysisJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitMediaAiAnalysisJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitMediaAiAnalysisJobResponse setBody(SubmitMediaAiAnalysisJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitMediaAiAnalysisJobResponseBody getBody() {
        return this.body;
    }

}
