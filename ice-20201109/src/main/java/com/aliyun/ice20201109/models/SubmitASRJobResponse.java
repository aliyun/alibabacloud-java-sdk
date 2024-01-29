// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitASRJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitASRJobResponseBody body;

    public static SubmitASRJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitASRJobResponse self = new SubmitASRJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitASRJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitASRJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitASRJobResponse setBody(SubmitASRJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitASRJobResponseBody getBody() {
        return this.body;
    }

}
