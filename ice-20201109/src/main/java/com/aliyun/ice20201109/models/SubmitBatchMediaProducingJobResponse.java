// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitBatchMediaProducingJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitBatchMediaProducingJobResponseBody body;

    public static SubmitBatchMediaProducingJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitBatchMediaProducingJobResponse self = new SubmitBatchMediaProducingJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitBatchMediaProducingJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitBatchMediaProducingJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitBatchMediaProducingJobResponse setBody(SubmitBatchMediaProducingJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitBatchMediaProducingJobResponseBody getBody() {
        return this.body;
    }

}
