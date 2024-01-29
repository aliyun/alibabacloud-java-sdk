// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetBatchMediaProducingJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBatchMediaProducingJobResponseBody body;

    public static GetBatchMediaProducingJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBatchMediaProducingJobResponse self = new GetBatchMediaProducingJobResponse();
        return TeaModel.build(map, self);
    }

    public GetBatchMediaProducingJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBatchMediaProducingJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBatchMediaProducingJobResponse setBody(GetBatchMediaProducingJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBatchMediaProducingJobResponseBody getBody() {
        return this.body;
    }

}
