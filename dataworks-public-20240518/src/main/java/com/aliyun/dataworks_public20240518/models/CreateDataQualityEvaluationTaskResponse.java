// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDataQualityEvaluationTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDataQualityEvaluationTaskResponseBody body;

    public static CreateDataQualityEvaluationTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataQualityEvaluationTaskResponse self = new CreateDataQualityEvaluationTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataQualityEvaluationTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDataQualityEvaluationTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDataQualityEvaluationTaskResponse setBody(CreateDataQualityEvaluationTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDataQualityEvaluationTaskResponseBody getBody() {
        return this.body;
    }

}
