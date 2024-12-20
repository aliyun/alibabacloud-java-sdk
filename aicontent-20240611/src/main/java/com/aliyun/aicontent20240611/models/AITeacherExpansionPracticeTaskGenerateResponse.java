// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class AITeacherExpansionPracticeTaskGenerateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AITeacherExpansionPracticeTaskGenerateResponseBody body;

    public static AITeacherExpansionPracticeTaskGenerateResponse build(java.util.Map<String, ?> map) throws Exception {
        AITeacherExpansionPracticeTaskGenerateResponse self = new AITeacherExpansionPracticeTaskGenerateResponse();
        return TeaModel.build(map, self);
    }

    public AITeacherExpansionPracticeTaskGenerateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AITeacherExpansionPracticeTaskGenerateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AITeacherExpansionPracticeTaskGenerateResponse setBody(AITeacherExpansionPracticeTaskGenerateResponseBody body) {
        this.body = body;
        return this;
    }
    public AITeacherExpansionPracticeTaskGenerateResponseBody getBody() {
        return this.body;
    }

}
