// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class PostMSSearchEnhanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PostMSSearchEnhanceResponseBody body;

    public static PostMSSearchEnhanceResponse build(java.util.Map<String, ?> map) throws Exception {
        PostMSSearchEnhanceResponse self = new PostMSSearchEnhanceResponse();
        return TeaModel.build(map, self);
    }

    public PostMSSearchEnhanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PostMSSearchEnhanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PostMSSearchEnhanceResponse setBody(PostMSSearchEnhanceResponseBody body) {
        this.body = body;
        return this;
    }
    public PostMSSearchEnhanceResponseBody getBody() {
        return this.body;
    }

}
