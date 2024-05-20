// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class CreateIllustrationTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public IllustrationTaskResult body;

    public static CreateIllustrationTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIllustrationTaskResponse self = new CreateIllustrationTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateIllustrationTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIllustrationTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateIllustrationTaskResponse setBody(IllustrationTaskResult body) {
        this.body = body;
        return this;
    }
    public IllustrationTaskResult getBody() {
        return this.body;
    }

}
