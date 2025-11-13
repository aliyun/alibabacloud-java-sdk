// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitSceneBatchEditingJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitSceneBatchEditingJobResponseBody body;

    public static SubmitSceneBatchEditingJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitSceneBatchEditingJobResponse self = new SubmitSceneBatchEditingJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitSceneBatchEditingJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitSceneBatchEditingJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitSceneBatchEditingJobResponse setBody(SubmitSceneBatchEditingJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitSceneBatchEditingJobResponseBody getBody() {
        return this.body;
    }

}
