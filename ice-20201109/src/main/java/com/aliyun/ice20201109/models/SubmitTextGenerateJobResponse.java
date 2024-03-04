// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitTextGenerateJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitTextGenerateJobResponseBody body;

    public static SubmitTextGenerateJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitTextGenerateJobResponse self = new SubmitTextGenerateJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitTextGenerateJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitTextGenerateJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitTextGenerateJobResponse setBody(SubmitTextGenerateJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitTextGenerateJobResponseBody getBody() {
        return this.body;
    }

}
