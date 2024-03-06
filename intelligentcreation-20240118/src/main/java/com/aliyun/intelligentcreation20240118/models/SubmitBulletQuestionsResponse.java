// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240118.models;

import com.aliyun.tea.*;

public class SubmitBulletQuestionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitBulletQuestionsResponseBody body;

    public static SubmitBulletQuestionsResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitBulletQuestionsResponse self = new SubmitBulletQuestionsResponse();
        return TeaModel.build(map, self);
    }

    public SubmitBulletQuestionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitBulletQuestionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitBulletQuestionsResponse setBody(SubmitBulletQuestionsResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitBulletQuestionsResponseBody getBody() {
        return this.body;
    }

}
