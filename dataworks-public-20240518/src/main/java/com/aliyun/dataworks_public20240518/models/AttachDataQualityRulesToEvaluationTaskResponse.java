// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class AttachDataQualityRulesToEvaluationTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AttachDataQualityRulesToEvaluationTaskResponseBody body;

    public static AttachDataQualityRulesToEvaluationTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachDataQualityRulesToEvaluationTaskResponse self = new AttachDataQualityRulesToEvaluationTaskResponse();
        return TeaModel.build(map, self);
    }

    public AttachDataQualityRulesToEvaluationTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachDataQualityRulesToEvaluationTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachDataQualityRulesToEvaluationTaskResponse setBody(AttachDataQualityRulesToEvaluationTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachDataQualityRulesToEvaluationTaskResponseBody getBody() {
        return this.body;
    }

}
