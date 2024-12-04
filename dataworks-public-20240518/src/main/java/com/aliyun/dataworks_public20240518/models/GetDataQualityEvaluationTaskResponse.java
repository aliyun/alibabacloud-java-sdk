// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetDataQualityEvaluationTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataQualityEvaluationTaskResponseBody body;

    public static GetDataQualityEvaluationTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataQualityEvaluationTaskResponse self = new GetDataQualityEvaluationTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetDataQualityEvaluationTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataQualityEvaluationTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataQualityEvaluationTaskResponse setBody(GetDataQualityEvaluationTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataQualityEvaluationTaskResponseBody getBody() {
        return this.body;
    }

}
