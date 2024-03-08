// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240118.models;

import com.aliyun.tea.*;

public class SubmitBulletQuestionsV1Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitBulletQuestionsQAResult body;

    public static SubmitBulletQuestionsV1Response build(java.util.Map<String, ?> map) throws Exception {
        SubmitBulletQuestionsV1Response self = new SubmitBulletQuestionsV1Response();
        return TeaModel.build(map, self);
    }

    public SubmitBulletQuestionsV1Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitBulletQuestionsV1Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitBulletQuestionsV1Response setBody(SubmitBulletQuestionsQAResult body) {
        this.body = body;
        return this;
    }
    public SubmitBulletQuestionsQAResult getBody() {
        return this.body;
    }

}
