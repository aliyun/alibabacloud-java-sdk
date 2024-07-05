// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitAnalysisJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitAnalysisJobResponseBody body;

    public static SubmitAnalysisJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitAnalysisJobResponse self = new SubmitAnalysisJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitAnalysisJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitAnalysisJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitAnalysisJobResponse setBody(SubmitAnalysisJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitAnalysisJobResponseBody getBody() {
        return this.body;
    }

}
