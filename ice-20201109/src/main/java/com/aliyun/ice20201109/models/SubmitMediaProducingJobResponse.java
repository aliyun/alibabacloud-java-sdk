// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitMediaProducingJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitMediaProducingJobResponseBody body;

    public static SubmitMediaProducingJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitMediaProducingJobResponse self = new SubmitMediaProducingJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitMediaProducingJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitMediaProducingJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitMediaProducingJobResponse setBody(SubmitMediaProducingJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitMediaProducingJobResponseBody getBody() {
        return this.body;
    }

}
