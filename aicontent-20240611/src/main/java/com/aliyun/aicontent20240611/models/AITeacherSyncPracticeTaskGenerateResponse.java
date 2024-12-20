// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class AITeacherSyncPracticeTaskGenerateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AITeacherSyncPracticeTaskGenerateResponseBody body;

    public static AITeacherSyncPracticeTaskGenerateResponse build(java.util.Map<String, ?> map) throws Exception {
        AITeacherSyncPracticeTaskGenerateResponse self = new AITeacherSyncPracticeTaskGenerateResponse();
        return TeaModel.build(map, self);
    }

    public AITeacherSyncPracticeTaskGenerateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AITeacherSyncPracticeTaskGenerateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AITeacherSyncPracticeTaskGenerateResponse setBody(AITeacherSyncPracticeTaskGenerateResponseBody body) {
        this.body = body;
        return this;
    }
    public AITeacherSyncPracticeTaskGenerateResponseBody getBody() {
        return this.body;
    }

}
