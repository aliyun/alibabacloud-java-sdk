// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class PostMSDataProcessingCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PostMSDataProcessingCountResponseBody body;

    public static PostMSDataProcessingCountResponse build(java.util.Map<String, ?> map) throws Exception {
        PostMSDataProcessingCountResponse self = new PostMSDataProcessingCountResponse();
        return TeaModel.build(map, self);
    }

    public PostMSDataProcessingCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PostMSDataProcessingCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PostMSDataProcessingCountResponse setBody(PostMSDataProcessingCountResponseBody body) {
        this.body = body;
        return this;
    }
    public PostMSDataProcessingCountResponseBody getBody() {
        return this.body;
    }

}
