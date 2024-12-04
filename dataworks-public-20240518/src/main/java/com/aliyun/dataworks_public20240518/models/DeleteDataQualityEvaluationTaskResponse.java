// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteDataQualityEvaluationTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDataQualityEvaluationTaskResponseBody body;

    public static DeleteDataQualityEvaluationTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataQualityEvaluationTaskResponse self = new DeleteDataQualityEvaluationTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDataQualityEvaluationTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDataQualityEvaluationTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDataQualityEvaluationTaskResponse setBody(DeleteDataQualityEvaluationTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDataQualityEvaluationTaskResponseBody getBody() {
        return this.body;
    }

}
