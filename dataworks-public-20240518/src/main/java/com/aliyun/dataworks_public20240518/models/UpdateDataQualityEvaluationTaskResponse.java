// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateDataQualityEvaluationTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDataQualityEvaluationTaskResponseBody body;

    public static UpdateDataQualityEvaluationTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataQualityEvaluationTaskResponse self = new UpdateDataQualityEvaluationTaskResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDataQualityEvaluationTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDataQualityEvaluationTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDataQualityEvaluationTaskResponse setBody(UpdateDataQualityEvaluationTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDataQualityEvaluationTaskResponseBody getBody() {
        return this.body;
    }

}
