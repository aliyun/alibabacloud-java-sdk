// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitVideoCognitionJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitVideoCognitionJobResponseBody body;

    public static SubmitVideoCognitionJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitVideoCognitionJobResponse self = new SubmitVideoCognitionJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitVideoCognitionJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitVideoCognitionJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitVideoCognitionJobResponse setBody(SubmitVideoCognitionJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitVideoCognitionJobResponseBody getBody() {
        return this.body;
    }

}
