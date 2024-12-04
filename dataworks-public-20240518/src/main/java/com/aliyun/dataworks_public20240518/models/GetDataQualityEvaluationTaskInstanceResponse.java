// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetDataQualityEvaluationTaskInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataQualityEvaluationTaskInstanceResponseBody body;

    public static GetDataQualityEvaluationTaskInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataQualityEvaluationTaskInstanceResponse self = new GetDataQualityEvaluationTaskInstanceResponse();
        return TeaModel.build(map, self);
    }

    public GetDataQualityEvaluationTaskInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataQualityEvaluationTaskInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataQualityEvaluationTaskInstanceResponse setBody(GetDataQualityEvaluationTaskInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataQualityEvaluationTaskInstanceResponseBody getBody() {
        return this.body;
    }

}
