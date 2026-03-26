// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ResumeYikeStoryboardJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResumeYikeStoryboardJobResponseBody body;

    public static ResumeYikeStoryboardJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ResumeYikeStoryboardJobResponse self = new ResumeYikeStoryboardJobResponse();
        return TeaModel.build(map, self);
    }

    public ResumeYikeStoryboardJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResumeYikeStoryboardJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResumeYikeStoryboardJobResponse setBody(ResumeYikeStoryboardJobResponseBody body) {
        this.body = body;
        return this;
    }
    public ResumeYikeStoryboardJobResponseBody getBody() {
        return this.body;
    }

}
