// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class GetAICoachAssessmentPointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAICoachAssessmentPointResponseBody body;

    public static GetAICoachAssessmentPointResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAICoachAssessmentPointResponse self = new GetAICoachAssessmentPointResponse();
        return TeaModel.build(map, self);
    }

    public GetAICoachAssessmentPointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAICoachAssessmentPointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAICoachAssessmentPointResponse setBody(GetAICoachAssessmentPointResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAICoachAssessmentPointResponseBody getBody() {
        return this.body;
    }

}
