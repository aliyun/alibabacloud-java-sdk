// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class GetIllustrationTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public IllustrationTaskResult body;

    public static GetIllustrationTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIllustrationTaskResponse self = new GetIllustrationTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetIllustrationTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIllustrationTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIllustrationTaskResponse setBody(IllustrationTaskResult body) {
        this.body = body;
        return this;
    }
    public IllustrationTaskResult getBody() {
        return this.body;
    }

}
