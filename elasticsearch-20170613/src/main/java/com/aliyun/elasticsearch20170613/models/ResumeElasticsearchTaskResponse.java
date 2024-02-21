// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ResumeElasticsearchTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResumeElasticsearchTaskResponseBody body;

    public static ResumeElasticsearchTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ResumeElasticsearchTaskResponse self = new ResumeElasticsearchTaskResponse();
        return TeaModel.build(map, self);
    }

    public ResumeElasticsearchTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResumeElasticsearchTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResumeElasticsearchTaskResponse setBody(ResumeElasticsearchTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ResumeElasticsearchTaskResponseBody getBody() {
        return this.body;
    }

}
