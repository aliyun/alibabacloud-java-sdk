// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class PostMSConvSearchTokenGeneratedResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PostMSConvSearchTokenGeneratedResponseBody body;

    public static PostMSConvSearchTokenGeneratedResponse build(java.util.Map<String, ?> map) throws Exception {
        PostMSConvSearchTokenGeneratedResponse self = new PostMSConvSearchTokenGeneratedResponse();
        return TeaModel.build(map, self);
    }

    public PostMSConvSearchTokenGeneratedResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PostMSConvSearchTokenGeneratedResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PostMSConvSearchTokenGeneratedResponse setBody(PostMSConvSearchTokenGeneratedResponseBody body) {
        this.body = body;
        return this;
    }
    public PostMSConvSearchTokenGeneratedResponseBody getBody() {
        return this.body;
    }

}
